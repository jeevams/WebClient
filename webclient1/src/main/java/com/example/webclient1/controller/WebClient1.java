package com.example.webclient1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.webclient1.dao.ToDo;
import com.example.webclient1.services.ToDoService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class WebClient1 {

	@Autowired
	ToDoService toDoService;





//	@GetMapping("/students")
//	public Flux<ToDo> getStudents() {
//		return toDoService.getStudents();
//	}
//	
	@GetMapping("/students/{id}")
	public Mono<ToDo> getStudents(@PathVariable Integer id) {
		Mono<ToDo> mt =toDoService.getStudentsById(id);

//		if(mt. == null) {
//			System.out.println("Response empty");
//		}
//		mt.block();
		return mt;
	}
	

}
