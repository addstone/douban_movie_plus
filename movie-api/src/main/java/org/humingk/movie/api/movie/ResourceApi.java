package org.humingk.movie.api.movie;

import org.humingk.movie.api.common.vo.ResourceMovieVo;
import org.humingk.movie.common.entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.NotNull;
import java.util.List;

// 用于生成API文档
// import org.springframework.web.bind.annotation.RestController;
// @RestController

/**
 * 电影资源
 *
 * @author humingk
 */
@Validated
@FeignClient("movie-server-movie")
public interface ResourceApi {
  /**
   * 电影资源
   *
   * @param id 豆瓣电影ID
   * @return
   * @apiNote 包括正版资源、盗版资源、在线资源、离线资源
   */
  @RequestMapping(value = "/movie/resource/bases", method = RequestMethod.GET)
  Result<List<ResourceMovieVo>> bases(@RequestParam("id") @NotNull Long id);
}
