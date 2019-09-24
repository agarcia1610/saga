package com.saganet.quiz.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class QuizResource {
	
	@GetMapping("/hola")
	public String hola(){
		return "Hola Mundo";
	}

}
