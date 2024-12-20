package com.examples.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examples.security.model.Tutorial;
import com.examples.security.service.TutorialService;

@RestController
@RequestMapping("/api/tutorials")
@CrossOrigin("*")
public class TutorialController {
	
	@Autowired
	TutorialService service;
	
	@GetMapping
	public List<Tutorial> getAllTutorials() {
		return service.getAllTutorials();
	}
	
	@PostMapping
	@CrossOrigin("*")
	public Tutorial addTutorial(@RequestBody Tutorial tutorial) {
		return service.addTutorial(tutorial);
	}

}
