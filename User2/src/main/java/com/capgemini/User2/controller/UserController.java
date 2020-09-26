package com.capgemini.User2.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.User2.service.IUserService;

import com.capgemini.User2.entity.User;
import com.capgemini.User2.exception.UserNotFoundException;

@RestController
@RequestMapping("/User")
public class UserController {
	
	private static final Logger log =LoggerFactory.getLogger(UserController.class);
	
	
	//inject the object dependency of userService Interface
	@Autowired
    private IUserService IUserService;
	
	
	
	//Registering the details of the user 
	@RequestMapping(method = RequestMethod.POST,value = "/signup")
	public ResponseEntity<?> register(@Valid @RequestBody User user){
		boolean signedUp = IUserService.registerUser(user);
		if(signedUp){
			return new ResponseEntity<>(HttpStatus.OK);
		}
		else
			return new ResponseEntity<>(HttpStatus.ALREADY_REPORTED);

		
	}

	// Login to the online movie ticket System so that user can booked the ticket
	@PostMapping("/login")
	public String login(@RequestBody User auth)
	{
		return IUserService.login1(auth) ;
		
	}
	
	
	//Getting the user by the particular id 
	@GetMapping("/userById/{userId}")
	public Optional<User> findOne(@PathVariable("userId") String userId)throws UserNotFoundException
    {
		Optional<User> b = IUserService.viewUserById(userId);
	    if (!b.isPresent())
		throw new UserNotFoundException("this is an invalid id !!");
	    return b;
    }
	

}
