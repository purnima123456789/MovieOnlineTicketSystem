package com.capgemini.User2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.User2.entity.MovieAdmin;
import com.capgemini.User2.service.IAdminService;

@RestController
@RequestMapping("/Admin")
public class AdminController {
	
	private static final Logger log =LoggerFactory.getLogger(AdminController.class);
	
	
	//inject the object dependency of userService Interface
	@Autowired
    private IAdminService IAdminService;
	
	//Adding theater to a particular city id
	@PostMapping("/AddingTheater")
	public MovieAdmin addingTheatre(@RequestBody MovieAdmin city)
	{	
		return IAdminService.addTheatre(city);
    }
	
	//Delete the theater through given id
	@GetMapping("/delete/{cityId}")
    public void delete(@PathVariable("cityId") int cityId)
	{
		 IAdminService.deleteCityById(cityId);
		
 	}
                                                                                                                                       
}
	


