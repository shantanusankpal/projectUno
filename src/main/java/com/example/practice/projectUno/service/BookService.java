package com.example.practice.projectUno.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.projectUno.dao.BookDao;
import com.example.practice.projectUno.dto.BookDto;
import com.example.practice.projectUno.mapper.BookMapper;
import com.example.practice.projectUno.repository.BookRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookService {

  @Autowired
  private final BookRepository bookRepository;

  public Boolean addBook(BookDao bookDao) {
    BookDto bookDto = BookDto.builder().name(bookDao.getName())
        .returnStatus(false)
        .takenDate(null)
        .returnDate(null)
        .build();
    bookRepository.addBook(bookDto);
    return true;
  }

  public List<BookDao> returnAllBooksInLibrary(Boolean bool) {
    List<BookDto> books = bookRepository.findByReturnStatus(bool);
    return BookMapper.toDaoList(books);
  }
}
