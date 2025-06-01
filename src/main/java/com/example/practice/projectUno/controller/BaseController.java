package com.example.practice.projectUno.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.projectUno.dao.BookDao;

import lombok.Getter;

@Getter
@RestController
@RequestMapping("/project")
public class BaseController {

  @GetMapping("/helloWorld")
  public String helloWOrld() {
    return "Hello World";
  }

  @GetMapping("/addBook")
  public String addaBook(@RequestBody BookDao bookDao) {
    return "Hello World";
  }
}
