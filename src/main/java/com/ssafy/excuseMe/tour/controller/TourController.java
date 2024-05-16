package com.ssafy.excuseMe.tour.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.excuseMe.tour.model.TourDto;
import com.ssafy.excuseMe.tour.service.TourService;

@RestController
@RequestMapping("/tour")
public class TourController {
	private final TourService tourService;

	public TourController(TourService tourService) {
		this.tourService = tourService;
	}
	@GetMapping
	public Map<String,Object> listTour(
			@RequestParam("keyword") String keyword,
			@RequestParam("type") String type,
			@RequestParam("region") String region
			){
		Map<String,Object> data = new HashMap<>();
		Map<String, String> map = new HashMap<>();
		map.put("keyword", keyword);
		map.put("type", type);
		map.put("region",region);
		List<TourDto> list = tourService.listTour(map);
		System.out.println(list);
		//페이지네이션 구현 제외
		data.put("totalCount", list.size());
		data.put("tourList", list);
		return data;
	}
}
