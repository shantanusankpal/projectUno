package com.example.practice.projectUno.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.practice.projectUno.dto.BookDto;

@Repository
public interface BookRepository extends JpaRepository<BookDto, Integer> {
  BookDto findByName(String name);

  List<BookDto> findByReturnStatus(Boolean bool);

  BookDto addBook(BookDto bookDto);

}
