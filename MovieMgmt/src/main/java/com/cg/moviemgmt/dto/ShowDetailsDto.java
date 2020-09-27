package com.cg.moviemgmt.dto;

import java.sql.Time;
import java.util.* ;

import com.cg.moviemgmt.entities.Movie;
public class ShowDetailsDto {

	private int showId;
	private String showName;
	private Time starttime ;
	private Time endtime  ;
	private Movie movieName ;
	private List<Integer>seatsId;
	
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public Time getStarttime() {
		return starttime;
	}
	public void setStarttime(Time starttime) {
		this.starttime = starttime;
	}
	public Time getEndtime() {
		return endtime;
	}
	public void setEndtime(Time endtime) {
		this.endtime = endtime;
	}

	public Movie getMovieName() {
		return movieName;
	}
	public void setMovieName(Movie movieName) {
		this.movieName = movieName;
	}
	public List<Integer> getSeatsId() {
		return seatsId;
	}
	public void setSeatsId(List<Integer> seatsId) {
		this.seatsId = seatsId;
	}

  

}
