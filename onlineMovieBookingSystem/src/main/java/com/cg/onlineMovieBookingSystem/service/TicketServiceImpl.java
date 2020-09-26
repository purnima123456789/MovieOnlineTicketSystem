package com.cg.onlineMovieBookingSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlineMovieBookingSystem.Entity.Theatre;
import com.cg.onlineMovieBookingSystem.Entity.Ticket;
import com.cg.onlineMovieBookingSystem.dao.TheatreDao;
import com.cg.onlineMovieBookingSystem.dao.TicketDao;
import com.cg.onlineMovieBookingSystem.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	TicketRepository ticketRepository;

	@Autowired
	TicketDao ticketDao;

	@Autowired
	TheatreDao theatreDao;

	@Override
	public void addTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		ticketDao.addTicket(ticket);
	}

	@Override
	public List<Ticket> showTicket() {
		// TODO Auto-generated method stub
		return ticketDao.showTicket();
	}

	@Override
	public void cancelBookings(int ticketId) {
		// TODO Auto-generated method stub
		ticketDao.cancelBookings(ticketId);
	}

	@Override
	public List<Theatre> selectByCityName(String theatreCity) {
		List<Theatre> theatres = theatreDao.selectByCity(theatreCity);
		return theatres;
	}
}
