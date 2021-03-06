package org.humingk.movie.dal.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 场景影人
 *
 *@author humingk
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CelebrityScene implements Serializable {
    /**
     * 场景影人ID
     */
    private Long id;

    /**
     * 豆瓣影人ID 0-未匹配 1-已匹配
     */
    private Long idCelebrityDouban;

    /**
     * 场景影人中文名
     */
    private String nameZh;

    /**
     * 场景影人英文名
     */
    private String nameEn;

    private static final long serialVersionUID = 1L;
}