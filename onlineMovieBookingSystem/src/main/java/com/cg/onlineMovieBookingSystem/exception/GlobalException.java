package com.cg.onlineMovieBookingSystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler({TicketNotFoundException.class})
	public ResponseEntity<String> handleException(Exception ex){
		 if(ex instanceof TicketNotFoundException) {
			
			HttpStatus status=HttpStatus.NOT_FOUND;
			return new ResponseEntity<String>("No recored exists of this Ticket ID!!", status);
		}
		else {
			return null;
		}
	}

}
