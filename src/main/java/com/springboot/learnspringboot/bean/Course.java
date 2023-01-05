package com.springboot.learnspringboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Course {

  private long id;
  private String name;
  private String author;

  @Override
  public String toString() {
    return "Course [id= " + id + " ,name = " + name + " author = " + author + "]";
  }
}
