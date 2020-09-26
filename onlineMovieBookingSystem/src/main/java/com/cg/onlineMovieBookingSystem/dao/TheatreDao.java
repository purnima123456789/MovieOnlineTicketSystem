package com.cg.onlineMovieBookingSystem.dao;

import java.util.List;
import java.util.Optional;

import com.cg.onlineMovieBookingSystem.Entity.Movie;
import com.cg.onlineMovieBookingSystem.Entity.Screen;
import com.cg.onlineMovieBookingSystem.Entity.Theatre;


public interface TheatreDao {
	public List<Theatre> selectByCity(String theatreCity);
	public List<Theatre> findAll();

}
