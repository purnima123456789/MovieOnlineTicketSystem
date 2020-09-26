package com.capgemini.User2.service;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.User2.repository.UserRepository;


import com.capgemini.User2.dao.UserDao;
import com.capgemini.User2.entity.User;
import com.capgemini.User2.exception.RegisterdEmailFoundException;


@Service
public class UserServiceImpl implements IUserService {

	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	UserDao userDao;

	
	
	public boolean registerUser(User user){
		Optional<User> userOptional = userDao.register(user.getEmail());
		if(userOptional.isPresent()){
			
			return false;
		}
		else
		{
			userDao.saveUser(user);
			return true;	
		}
	}
	


	public String login1(User userEntityObj) {

		
      String returnString = "Invalid Credentials";
		
		try
		{
		   User userEntity = userRepository.findById(userEntityObj.getUserId()).get();
		
		  if(userEntityObj.getUserPassword().equals(userEntity.getUserPassword()) && userEntityObj.getUserType().equals(userEntity.getUserType()))
			{
				returnString="Login Successful";
			 
				return returnString;
			}
		else if(userEntityObj.getUserPassword().equals(userEntity.getUserPassword())||!userEntityObj.getUserType().equals(userEntity.getUserType()))
		{
			returnString="invalid userType";
			return  returnString;
		}

		return returnString;

		
		}
		
		catch (NoSuchElementException ex)
		{
			return "Invalid credentials";
		}
		
	}



	@Override
	public Optional<User> viewUserById(String userId) {
		
		
		
      Optional<User> UserObj=userRepository.findById(userId);
		
	  return UserObj;		
     }
		
	}