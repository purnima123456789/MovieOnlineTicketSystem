package org.cap.screenmanagement.dao;

import org.cap.screenmanagement.entities.Screen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IScreenDao extends JpaRepository<Screen, Integer> {
}
