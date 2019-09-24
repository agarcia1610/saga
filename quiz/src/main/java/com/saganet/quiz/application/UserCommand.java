package com.saganet.quiz.application;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserCommand {

  String name;
  String lastName;
  String secondLastName;
  String password;
  MunicipalityEO municipality;

}
