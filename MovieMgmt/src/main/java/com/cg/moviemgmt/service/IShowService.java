package com.cg.moviemgmt.service;

import java.util.List;
import com.cg.moviemgmt.entities.Show;

public interface IShowService {

	Show Save(Show s) ;
	Show fetchById(int showId) ;
	String DeleteShow(int showId);
	List<Show>fetchAll() ; 
	
	
	
}
