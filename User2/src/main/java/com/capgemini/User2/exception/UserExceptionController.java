package com.capgemini.User2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class UserExceptionController {
	
	@ExceptionHandler(UserNotFoundException.class)
	
	@ResponseBody
	public ResponseEntity<?> handleException(UserNotFoundException ex) 
	{

		if(ex instanceof UserNotFoundException) {
	        HttpStatus status = HttpStatus.NOT_FOUND;
			return new ResponseEntity("Invalid User Id ", status);
		}
		else {
			return null;
		}
	}
	}

