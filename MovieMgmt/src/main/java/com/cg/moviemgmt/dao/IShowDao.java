package com.cg.moviemgmt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.moviemgmt.entities.Show;

public interface IShowDao extends JpaRepository<Show, Integer> {

}
