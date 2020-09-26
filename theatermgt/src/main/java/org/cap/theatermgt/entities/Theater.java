package org.cap.theatermgt.entities;

import javax.persistence.Column;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import java.util.*;

@Entity
public class Theater {

	@Id
	@GeneratedValue
	@Column(name="theater_id")
	private Integer theaterId;
	private String theaterName;
	private String theaterCity;
	@ElementCollection
	private List<String> movieList;
	@ElementCollection
	private List<Integer> screenList;
	private String managerName;
	private	String managerContact;
	

	public Integer getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(Integer theaterId) {
		this.theaterId = theaterId;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getTheaterCity() {
		return theaterCity;
	}
	public void setTheaterCity(String theaterCity) {
		this.theaterCity = theaterCity;
	}
	
	public List<Integer> getScreenList() {
		return screenList;
	}
	public void setScreenList(List<Integer> screenList) {
		this.screenList = screenList;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerContact() {
		return managerContact;
	}
	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}
	public List<String> getMovieList() {
		return movieList;
	}
	public void setMovieList(List<String> movieList) {
		this.movieList = movieList;
	}
	@Override
	public String toString() {
		return "Theater [theaterId=" + theaterId + ", theaterName=" + theaterName + ", theaterCity=" + theaterCity
				+ ", movieList=" + movieList + ", screenList=" + screenList + ", managerName=" + managerName
				+ ", managerContact=" + managerContact + "]";
	}
	
	
}
