package com.cg.onlineMovieBookingSystem.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlineMovieBookingSystem.Entity.Theatre;
import com.cg.onlineMovieBookingSystem.Entity.Ticket;
import com.cg.onlineMovieBookingSystem.exception.TicketNotFoundException;
import com.cg.onlineMovieBookingSystem.service.TheatreService;
import com.cg.onlineMovieBookingSystem.service.TicketService;

@RestController

@RequestMapping("/tickets")
public class TicketController {

	private static final Logger log=LoggerFactory.getLogger(TicketController.class);
	@Autowired
	TicketService ticketService;


	@Autowired
	TheatreService theatreService;

	//Retrieving the list of tickets.
	@GetMapping("/all")
	public List<Ticket> showTicket()
	{
		return ticketService.showTicket();
	}

	//Canceling the bookings by ticketId.
	@GetMapping("/delete")
	public String delete(@RequestParam("ticketId") int ticketId) {
		ticketService.cancelBookings(ticketId);
		System.out.println("delete Done");
		return "Deletion is performed successfully";

	}

	//Inserting the ticket details
	@RequestMapping(method =RequestMethod.POST,value= {"/addTicket"})
	public void addTicket(@RequestBody Ticket ticket) {
		ticketService.addTicket(ticket);
	}

	//Retrieving the theater details by theatreCity.
	@GetMapping("/selectByCity/{theatreCity}")
	public List<Theatre> selectByCity(@PathVariable(value="theatreCity") String theatreCity){
		return theatreService.selectByCityName(theatreCity);
	}	
}
