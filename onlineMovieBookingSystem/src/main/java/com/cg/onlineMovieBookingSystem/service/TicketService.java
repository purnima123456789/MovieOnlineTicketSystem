package com.cg.onlineMovieBookingSystem.service;

import java.util.List;
import java.util.Optional;

import com.cg.onlineMovieBookingSystem.Entity.Theatre;
import com.cg.onlineMovieBookingSystem.Entity.Ticket;

public interface TicketService {

	public void addTicket(Ticket ticket);
	public List<Ticket> showTicket();
	public void cancelBookings(int ticketId);
	public List<Theatre> selectByCityName(String theatreCity);

}
