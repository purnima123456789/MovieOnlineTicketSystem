package org.cap.seatmanagement.service;

import java.util.List;

import org.cap.seatmanagement.entities.Seat;

public interface ISeatService {

	Seat saveSeat(Seat seat);

	List<Seat> getAllSeats();

	Boolean blockSeats(int seatId);

	Boolean bookSeats(int seatId);

	Boolean cancelSeatBooking(int seatId);
}
