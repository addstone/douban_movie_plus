package org.humingk.movie.aspect;

import com.alibaba.fastjson.JSONObject;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


/**
 * 日志切面类
 *
 * @author humingk
 */
@Aspect
@Component
public class LogAspect {
    /**
     * 打印日志
     */
    private final static Logger logger = LoggerFactory.getLogger(LogAspect.class);

    /**
     * 切入点:
     * controller层所有方法
     */
    @Pointcut("execution(public * org.humingk.movie.controller..*.*(..))")
    public void controllerPointCut() {
    }

    /**
     * 前置通知:
     * controller层所有方法调用日志
     *
     * @param joinPoint
     */
    @Before("controllerPointCut()")
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        Map logMap = new HashMap() {
            {
                put("url", request.getRequestURL());
                put("ip", request.getRemoteAddr());
                put("class", joinPoint.getSignature().getDeclaringTypeName());
                put("method", joinPoint.getSignature().getName());
                put("args", joinPoint.getArgs());
            }
        };
        logger.info("request: {}", new JSONObject(logMap));
    }
}
