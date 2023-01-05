package com.springboot.learnspringboot.database.model;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_course")
public class CourseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "course_id", nullable = false)
  private UUID courseId;

  @Column(name = "course_name", nullable = false)
  private String courseName;

  @Column(name = "number", nullable = false)
  private Long number;
}
