package com.springboot.learnspringboot.controller;

import com.springboot.learnspringboot.bean.Course;
import com.springboot.learnspringboot.database.model.CourseEntity;
import com.springboot.learnspringboot.database.repository.CourseRepository;
import java.util.Arrays;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CourseController {

  private final CourseRepository courseRepository;

  @GetMapping("/course")
  public CourseEntity getCourse(){
    return courseRepository.findByCourseName("java");
//    return Arrays.asList(new Course(1, "Learn Microservices", "in28Minutes"));
  }
}
