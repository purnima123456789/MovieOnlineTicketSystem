package com.capgemini.User2.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capgemini.User2.entity.User;


@Repository("UserRepository")
public interface UserRepository extends JpaRepository<User, String> {
	
	//his
	@Query(value="Select u from User u where u.email= :email")
	Optional<User> searchByEmail(@Param("email") String email);
}
