package com.example.practice.projectUno.dto;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "book")
@Builder
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
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
