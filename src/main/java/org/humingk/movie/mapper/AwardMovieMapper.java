package org.humingk.movie.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.humingk.movie.entity.AwardMovie;
import org.humingk.movie.entity.AwardMovieExample;

public interface AwardMovieMapper {
    long countByExample(AwardMovieExample example);

    int deleteByExample(AwardMovieExample example);

    int deleteByPrimaryKey(String id);

    int insert(AwardMovie record);

    int insertSelective(AwardMovie record);

    List<AwardMovie> selectByExample(AwardMovieExample example);

    AwardMovie selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AwardMovie record, @Param("example") AwardMovieExample example);

    int updateByExample(@Param("record") AwardMovie record, @Param("example") AwardMovieExample example);

    int updateByPrimaryKeySelective(AwardMovie record);

    int updateByPrimaryKey(AwardMovie record);
}