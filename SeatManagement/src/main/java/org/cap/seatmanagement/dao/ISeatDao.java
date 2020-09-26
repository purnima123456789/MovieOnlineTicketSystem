package org.cap.seatmanagement.dao;

import org.cap.seatmanagement.entities.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISeatDao extends JpaRepository<Seat, Integer>{

}
