package org.humingk.movie.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.humingk.movie.entity.TrailerMovieDouban;
import org.humingk.movie.entity.TrailerMovieDoubanExample;

public interface TrailerMovieDoubanMapper {
    long countByExample(TrailerMovieDoubanExample example);

    int deleteByExample(TrailerMovieDoubanExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TrailerMovieDouban record);

    int insertSelective(TrailerMovieDouban record);

    List<TrailerMovieDouban> selectByExample(TrailerMovieDoubanExample example);

    TrailerMovieDouban selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TrailerMovieDouban record, @Param("example") TrailerMovieDoubanExample example);

    int updateByExample(@Param("record") TrailerMovieDouban record, @Param("example") TrailerMovieDoubanExample example);

    int updateByPrimaryKeySelective(TrailerMovieDouban record);

    int updateByPrimaryKey(TrailerMovieDouban record);
}