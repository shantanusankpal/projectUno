package com.example.practice.projectUno.dao;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDao {
  private String name;
  private Boolean returnStatus;
  private LocalDateTime takenDate;
  private LocalDateTime returnDate;
  private int id;
}
