package com.capgemini.User2.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.capgemini.User2.entity.User;

@Service
public interface IUserService {
	
	public boolean registerUser(User user) ;

	public String login1(User auth);

	public Optional<User> viewUserById(String userId);

}
