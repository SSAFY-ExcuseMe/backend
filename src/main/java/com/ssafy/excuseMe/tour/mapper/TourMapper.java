package com.ssafy.excuseMe.tour.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.excuseMe.tour.model.TourDto;

@Mapper
public interface TourMapper {
	List<TourDto> listTour(Map<String,String> map);
	
}
