package com.cg.onlineMovieBookingSystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.onlineMovieBookingSystem.Entity.Theatre;
import com.cg.onlineMovieBookingSystem.Entity.Ticket;
import com.cg.onlineMovieBookingSystem.repository.TheatreRepository;
import com.cg.onlineMovieBookingSystem.repository.TicketRepository;

@Component
public class TicketDaoImpl implements TicketDao{

	@Autowired
	TicketRepository ticketRepository;
	@Autowired
	TheatreRepository theatreRepository;

	public void addTicket(Ticket ticket) {
		ticketRepository.save(ticket);
	}


	public List<Ticket> showTicket() {
		return (List<Ticket>)ticketRepository.findAll();
	}


	public void cancelBookings(int ticketId) {
		ticketRepository.deleteById(ticketId);
	}

	@Override
	public List<Theatre> selectByCity(String theatreCity) {
		return theatreRepository.findAllByTheatreCity(theatreCity);
	}


}
