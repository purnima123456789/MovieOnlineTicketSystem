package com.capgemini.User2.service;

import org.springframework.stereotype.Service;


import com.capgemini.User2.entity.MovieAdmin;

@Service
public interface IAdminService {
	
	public MovieAdmin addTheatre(MovieAdmin cityObj);


	public void deleteCityById(int cityId);
	

}
