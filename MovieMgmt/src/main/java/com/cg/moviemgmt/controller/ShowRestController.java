package com.capg.MovieMgmt.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.capg.MovieMgmt.dto.ShowDetailsDto;
import com.capg.MovieMgmt.dto.ShowRequestDto;
import com.capg.MovieMgmt.entities.Show;
import com.capg.MovieMgmt.service.IShowService;

import java.util.*;

@RestController
@RequestMapping("/shows")
public class ShowRestController {
	
	@Autowired
	private IShowService showService ;
	
	@PostMapping("/add/{id}")
	public ResponseEntity<ShowDetailsDto> addShow(@RequestBody ShowRequestDto showDto){
		Show show = convertShow(showDto) ;
		showService.Save(show);
		ShowDetailsDto detailsDto = new ShowDetailsDto();
		detailsDto = convertDetails(show);
		ResponseEntity<ShowDetailsDto> response = new ResponseEntity<ShowDetailsDto>(detailsDto, HttpStatus.OK);
		return response;
	}

	private ShowDetailsDto convertDetails(Show show) {
		ShowDetailsDto detailsDto = new ShowDetailsDto();
		detailsDto.setMovieName(show.getMovieName());
		detailsDto.setStarttime(show.getShowStartTime());
		detailsDto.setEndtime(show.getShowEndTime());
		detailsDto.setSeatsId(show.getSeatsId());
		detailsDto.setShowId(show.getShowId());
		detailsDto.setShowName(show.getShowName());
		detailsDto.setSeatsId(addSeats());
		return detailsDto;
	}

	private Show convertShow(ShowRequestDto showDto) {
		Show show = new Show();
		show.setMovieName(showDto.getMovieName());
		show.setShowName(showDto.getShowName());
		show.setSeatsId(addSeats());
		show.setScreenId(showDto.getScreenId());
		show.setTheaterId(showDto.getTheaterId());
		show.setShowStartTime(showDto.getShowStartTime());
		show.setShowEndTime(showDto.getShowEndTime());
		return show;
	}
	
	private List<Integer> addSeats()
	{
		List<Integer> seatsId = new ArrayList<>();
		seatsId.add(101);
		seatsId.add(102);
		return seatsId;
	}
	
	

}

