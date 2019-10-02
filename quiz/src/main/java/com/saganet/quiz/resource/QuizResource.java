package com.saganet.quiz.resource;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class QuizResource {

  @GetMapping("/hola")
  public String hola() {
    return "Hola Mundo";
  }
  
  
  @GetMapping("/hola2")
  public String hola2() {
    
    return "formulario";
    
  }
  
  @PostMapping("/holaPost")
  public String holaPost() {
	    return "has hecho una peticion post";
	  }

}
