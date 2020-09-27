package com.cg.moviemgmt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.moviemgmt.entities.Movie;

public interface IMovieDao extends JpaRepository<Movie, Integer> {
	
	
}
