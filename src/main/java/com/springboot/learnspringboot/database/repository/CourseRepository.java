package com.springboot.learnspringboot.database.repository;

import com.springboot.learnspringboot.database.model.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, UUID> {

  CourseEntity findByCourseName(String courseName);
}
