package com.example.practice.projectUno.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.projectUno.dao.BookDao;
import com.example.practice.projectUno.service.BookService;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RestController
@RequestMapping("/project")
@RequiredArgsConstructor
public class BaseController {

  private final BookService bookService;

  @GetMapping("/helloWorld")
  public String helloWOrld() {
    return "Hello World";
  }

  @PostMapping("/addBook")
  public Boolean addBook(@RequestBody BookDao bookDao) {
    return bookService.addBook(bookDao);
  }

  @GetMapping("/helloWorld")
  public List<BookDao> booksByReturStatus(@RequestParam Boolean bool) {
    return bookService.returnAllBooksInLibrary(bool);
  }
}
