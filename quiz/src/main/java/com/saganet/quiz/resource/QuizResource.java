package com.saganet.quiz.resource;

import com.saganet.quiz.application.QuizCommand;
import com.saganet.quiz.domain.model.Quiz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class QuizResource {

  @GetMapping("/hola")
  public String hola() {
    return "Hola Mundo";
  }

  @PostMapping()
  public Quiz createQuiz(@RequestBody QuizCommand quizCommand) {

    Quiz quiz = new Quiz();
    return quiz;
  }

}
