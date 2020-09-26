package com.cg.onlineMovingBookingSystem.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.client.RestTemplate;

import com.cg.onlineMovieBookingSystem.Entity.Ticket;

@ContextConfiguration
public class TicketTest { 
	RestTemplate template;

	@BeforeEach
	public void setUp()
	{
		template=new RestTemplate();		
	}
	@Test
	public void addTicket() {
		Ticket ticket=new Ticket();

		ticket.setTicketId(7);
		ticket.setNoOfSeats(2);
		ticket.setSeatName(null);
		ticket.setScreenName("S3");
		ticket.setTicketStatus(false);

		Ticket t1=template.postForObject
				("http://localhost:8050/tickets/addTicket", 
						ticket, Ticket.class);
		Assertions.assertNotNull(t1);
		System.out.println("Add ticket Working "+t1);

	}

}
