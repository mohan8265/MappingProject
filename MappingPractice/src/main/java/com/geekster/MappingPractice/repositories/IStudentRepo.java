package com.geekster.MappingPractice.repositories;

import com.geekster.MappingPractice.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends JpaRepository<Student,String> {
}
