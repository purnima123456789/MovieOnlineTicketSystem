package org.cap.theatermgt.service;

import java.util.List;




import java.util.Optional;

import javax.transaction.Transactional;
import org.cap.theatermgt.dao.Dao;
import org.cap.theatermgt.entities.Theater;
import org.cap.theatermgt.exception.TheaterNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TheaterServiceImpl implements ITheaterService {

	@Autowired
	private Dao dao;

	
	@Override
	public Theater save(Theater t) {
		Theater theater = dao.save(t);
		return theater;
	}

	@Override
	public List<Theater> fetchAll() {
		List<Theater> theaters = dao.findAll();
		return theaters;
	}

	@Override
	public Theater fetchById(int theaterId) {
		Optional<Theater> optional = dao.findById(theaterId);
				if(optional.isPresent()) {
					Theater th = optional.get();
					return th;
					}
		throw new TheaterNotFoundException("theater not found for id="+theaterId);
	}

	@Override
	public Boolean delete(int theaterId) {
		Theater theater = fetchById(theaterId);
	    dao.delete(theater);
		return true;
	}


}
