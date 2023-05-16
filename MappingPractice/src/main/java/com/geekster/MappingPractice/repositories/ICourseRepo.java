package com.geekster.MappingPractice.repositories;

import com.geekster.MappingPractice.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepo extends JpaRepository<Course,String> {
}
