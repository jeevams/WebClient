package com.example.webclient2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.webclient2.entity.StudentEntity;
import com.example.webclient2.jparespo.StudentRepo;
import com.example.webclient2.services.WebClientServices;
@RestController
public class WebClient2 {

	@Autowired
	WebClientServices webClientServices;

	@Autowired
	StudentRepo studentRepo;

	@GetMapping("/students")
	public List<StudentEntity> displayint() {
		return studentRepo.findAll();
	}


	@GetMapping("/students/{id}")
	public Optional<StudentEntity> displayId(@PathVariable Integer id) {
		return studentRepo.findById(id);
	}

}
