package com.example.practice.projectUno.dto;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class BookDto {
  @Column(name = "name")
  private String name;
  @Column(name = "return_status")
  private Boolean returnStatus;
  @Column(name = "taken_date")
  private LocalDateTime takenDate;
  @Column(name = "return_date")
  private LocalDateTime returnDate;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
}
