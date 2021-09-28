package com.example.hellospring;

import com.example.hellospring.controllers.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
public class HelloSpringApplication extends Controller {


  @RequestMapping("/greetings")
  String greetings(String name) {
    //http://localhost:8080/greetings?name=YourNameHere
    return "Greetings " + name + ", welcome to my project!";
  }

  @GetMapping("/parameter")
  public String parameter(@RequestParam String input) {
    //localhost:8080/parameter?input=HelloWorld
    return input;
  }


  public static void main(String[] args) {
    SpringApplication.run(HelloSpringApplication.class, args);

  }
}
