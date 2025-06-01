package com.example.practice.projectUno.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practice.projectUno.dto.BookDto;

public interface BookRepository extends JpaRepository<BookDto, Integer> {
  BookDto findByName(String name);

  List<BookDto> findByReturnStatus(Boolean bool);

  BookDto addBook(BookDto bookDto);

}
