package com.example.hellospring.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.hellospring.services.ErDetFredag;

@RestController
@EnableAutoConfiguration
public class Controller extends ErDetFredag {


  @GetMapping("/erdetfredag")
  public String erDetFredag(){
    return ErDetFredag.IsItFriday();
  }

}
