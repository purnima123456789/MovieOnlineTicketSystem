package com.cg.onlineMovieBookingSystem.Entity;

import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "valid")
	@Column(name="ticketId",length=8)
	private int ticketId;

	@Column(name="noOfSeats")
	private int noOfSeats;

	@ElementCollection
	private List<String> seatNames;

	@Column(name="ticketStatus")
	private boolean ticketStatus;

	@Column(name="screenName",nullable=false)
	private String screenName;

	private int bookingId;

	public Ticket() {
	}

	public Ticket(int ticketId, int noOfSeats, List<String> seatNames, boolean ticketStatus, String screenName,
			int bookingId) {
		super();
		this.ticketId = ticketId;
		this.noOfSeats = noOfSeats;
		this.seatNames = seatNames;
		this.ticketStatus = ticketStatus;
		this.screenName = screenName;
		this.bookingId = bookingId;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public List<String> getSeatName() {
		return seatNames;
	}

	public void setSeatName(List<String> seatNames) {
		this.seatNames = seatNames;
	}

	public boolean isTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(boolean ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public int getBooking() {
		return bookingId;
	}

	public void setBooking(int bookingId) {
		this.bookingId = bookingId;
	}



}
