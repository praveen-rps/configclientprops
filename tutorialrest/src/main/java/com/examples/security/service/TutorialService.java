package com.examples.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.security.dao.TutorialDao;
import com.examples.security.model.Tutorial;

@Service
public class TutorialService {
	
	@Autowired
	private TutorialDao tutorialDao;
	
	
	
	public List<Tutorial> getAllTutorials() {
		return tutorialDao.findAll();
	}

	public Tutorial addTutorial(Tutorial tutorial) {
		return tutorialDao.save(tutorial);
	}
}
