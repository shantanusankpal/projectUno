package com.example.practice.projectUno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class ProjectUnoApplication {

  public static void main(String[] args) {
    SpringApplication.run(ProjectUnoApplication.class, args);
  }

}
