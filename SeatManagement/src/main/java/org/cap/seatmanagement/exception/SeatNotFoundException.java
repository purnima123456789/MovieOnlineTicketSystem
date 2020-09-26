package org.cap.seatmanagement.exception;

public class SeatNotFoundException extends RuntimeException {
	
	public SeatNotFoundException(String message) {
		super(message);
	}
}
