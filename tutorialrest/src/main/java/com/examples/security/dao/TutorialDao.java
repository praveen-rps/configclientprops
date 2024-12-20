package com.examples.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examples.security.model.Tutorial;


@Repository
public interface TutorialDao extends JpaRepository<Tutorial,Integer>{

}
