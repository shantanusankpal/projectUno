package com.example.practice.projectUno.dao;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDao {
  private String name;
  private Boolean returnStatus;
  private LocalDateTime takenDate;
  private LocalDateTime returnDate;
  private int id;
}
