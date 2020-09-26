package com.capgemini.User2.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.User2.entity.User;
import com.capgemini.User2.repository.UserRepository;


@Component
public class UserDaoImpl implements UserDao {
	
	@Autowired
	UserRepository userRepository;
	
	public Optional<User> register(String email) {
		return userRepository.searchByEmail(email);
		
	}
	
	public void saveUser(User user) {
		userRepository.save(user);
	}

}
