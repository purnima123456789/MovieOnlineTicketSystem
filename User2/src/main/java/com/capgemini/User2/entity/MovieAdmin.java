package com.capgemini.User2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="theatre")
public class MovieAdmin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cityId;
	private String city;
	private String theatre;
	private int screen;
	private String movie;
	private String day;
	private String showTime;
	
	
	
	
	public MovieAdmin()
	{
		
	}
	
	public MovieAdmin(int cityId, String city, String theatre, int screen, String movie, String day, String showTime)
	
	{
	    this.cityId=cityId;
		this.city=city;
		this.theatre=theatre;
		this.screen=screen;
		this.movie= movie;
		this.day=day;
		this.showTime=showTime;
		
	}
	
	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTheatre() {
		return theatre;
	}
	public void setTheatre(String theatre) {
		this.theatre = theatre;
	}
	public int getScreen() {
		return screen;
	}
	public void setScreen(int screen) {
		this.screen = screen;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getShowTime() {
		return showTime;
	}
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	
	@Override
	public String toString() {
		return "MovieAdmin [cityId="+ cityId +", city=" + city + ", theatre=" + theatre + ", screen=" + screen + ", movie=" + movie
				+ ", day=" + day + ", showTime=" + showTime + "]";
	}

	
	
	

}
