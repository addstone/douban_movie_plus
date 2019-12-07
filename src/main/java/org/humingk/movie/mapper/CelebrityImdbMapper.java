package org.humingk.movie.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.humingk.movie.entity.CelebrityImdb;
import org.humingk.movie.entity.CelebrityImdbExample;

public interface CelebrityImdbMapper {
    long countByExample(CelebrityImdbExample example);

    int deleteByExample(CelebrityImdbExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CelebrityImdb record);

    int insertSelective(CelebrityImdb record);

    List<CelebrityImdb> selectByExample(CelebrityImdbExample example);

    CelebrityImdb selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CelebrityImdb record, @Param("example") CelebrityImdbExample example);

    int updateByExample(@Param("record") CelebrityImdb record, @Param("example") CelebrityImdbExample example);

    int updateByPrimaryKeySelective(CelebrityImdb record);

    int updateByPrimaryKey(CelebrityImdb record);
}