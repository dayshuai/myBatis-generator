package com.moviemn.mapper;

import com.moviemn.bean.TbMovieSeriesEntity;

public interface TbMovieSeriesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbMovieSeriesEntity record);

    int insertSelective(TbMovieSeriesEntity record);

    TbMovieSeriesEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbMovieSeriesEntity record);

    int updateByPrimaryKey(TbMovieSeriesEntity record);
}