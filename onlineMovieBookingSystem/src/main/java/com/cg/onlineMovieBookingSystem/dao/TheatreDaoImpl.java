package com.cg.onlineMovieBookingSystem.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.onlineMovieBookingSystem.Entity.Movie;
import com.cg.onlineMovieBookingSystem.Entity.Screen;
import com.cg.onlineMovieBookingSystem.Entity.Theatre;
import com.cg.onlineMovieBookingSystem.repository.TheatreRepository;

@Component
public class TheatreDaoImpl implements TheatreDao {

	@Autowired
	TheatreRepository theatreRepository;

	@Override
	public List<Theatre> selectByCity(String theatreCity) {
		return theatreRepository.findAllByTheatreCity(theatreCity);
	}
	@Override
	public List<Theatre> findAll() {
		return (List<Theatre>) theatreRepository.findAll();
	}
}
