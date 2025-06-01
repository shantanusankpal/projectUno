package com.example.practice.projectUno.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.example.practice.projectUno.dao.BookDao;
import com.example.practice.projectUno.dto.BookDto;

import lombok.Builder;

@Builder
public class BookMapper {
  public static BookDao toDao(BookDto dto) {
    return BookDao.builder()
        .id(dto.getId())
        .name(dto.getName())
        .returnStatus(dto.getReturnStatus())
        .takenDate(dto.getTakenDate())
        .returnDate(dto.getReturnDate())
        .build();
  }

  public static List<BookDao> toDaoList(List<BookDto> dtoList) {
    return dtoList.stream().map(BookMapper::toDao).collect(Collectors.toList());
  }
}
