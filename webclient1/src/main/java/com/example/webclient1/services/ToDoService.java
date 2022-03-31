package com.example.webclient1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.webclient1.dao.ToDo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ToDoService {


	@Autowired
	WebClient webClient;




	public ToDo getStudents() {
		return webClient.get()
				.uri("/students")
				.retrieve()
				.bodyToMono(new ParameterizedTypeReference<ToDo>() {
				}).block();
	}

	public Mono<ToDo> getStudentsById(Integer id){
		System.out.println("blocked");
		Mono<ToDo> mt = webClient.get()
				.uri("/students/{id}",id)
				.retrieve()
				.bodyToMono(ToDo.class);
		mt.doFinally((c)->{
			System.out.println("Web client Response"+c.toString());
		});
		mt.doOnSuccess((s)->{
			System.out.println("Success");
		});
		return mt;
	}


}
