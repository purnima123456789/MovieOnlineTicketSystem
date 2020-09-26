package com.cg.onlineMovieBookingSystem.dao;

import java.util.List;

import com.cg.onlineMovieBookingSystem.Entity.Theatre;
import com.cg.onlineMovieBookingSystem.Entity.Ticket;

public interface TicketDao {


	public List<Ticket> showTicket();
	public void cancelBookings(int ticketId);
	public void addTicket(Ticket ticket);
	public List<Theatre> selectByCity(String theatreCity);
}
