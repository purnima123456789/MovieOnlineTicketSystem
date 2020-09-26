package com.cg.onlineMovieBookingSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlineMovieBookingSystem.Entity.Movie;
import com.cg.onlineMovieBookingSystem.Entity.Screen;
import com.cg.onlineMovieBookingSystem.Entity.Seat;
import com.cg.onlineMovieBookingSystem.Entity.Show;
import com.cg.onlineMovieBookingSystem.Entity.Theatre;
import com.cg.onlineMovieBookingSystem.repository.TheatreRepository;
import com.cg.onlineMovieBookingSystem.service.TheatreService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/theatres")
public class TheatreController {

	@Autowired
	TheatreService theatreService;

	//Retrieving the theater details.
	@GetMapping("/all")
	public List<Theatre> showAll(){
		return theatreService.findAll();

	}
      //User Retrieving the theater details by theatreCity.
	@GetMapping("/selectByCity/{theatreCity}")
	public List<Theatre> selectByCity(@PathVariable(value="theatreCity") String theatreCity){
		return theatreService.selectByCityName(theatreCity);
	}
}
