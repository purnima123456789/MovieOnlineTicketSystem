package com.cg.onlineMovieBookingSystem.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlineMovieBookingSystem.Entity.Movie;
import com.cg.onlineMovieBookingSystem.Entity.Screen;
import com.cg.onlineMovieBookingSystem.Entity.Seat;
import com.cg.onlineMovieBookingSystem.Entity.Show;
import com.cg.onlineMovieBookingSystem.Entity.Theatre;
import com.cg.onlineMovieBookingSystem.dao.TheatreDao;


@Service
public class TheatreServiceImpl implements TheatreService{

	@Autowired
	TheatreDao theatreDao;
	

	@Override
	public List<Theatre> selectByCityName(String theatreCity) {
		List<Theatre> theatres = theatreDao.selectByCity(theatreCity);
		return theatres;
	}
	@Override
	public List<Theatre> findAll() {
		return theatreDao.findAll();
	}

}
