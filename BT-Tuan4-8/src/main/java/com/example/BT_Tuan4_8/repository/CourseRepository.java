package com.example.BT_Tuan4_8.repository;

import com.example.BT_Tuan4_8.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
}
