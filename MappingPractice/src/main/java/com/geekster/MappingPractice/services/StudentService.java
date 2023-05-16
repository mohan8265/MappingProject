package com.geekster.MappingPractice.services;

import com.geekster.MappingPractice.models.Student;
import com.geekster.MappingPractice.repositories.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    IStudentRepo studentRepo;
    public String saveStudent(Student student) {
        studentRepo.save(student);
        return "Student saved";
    }

    public List<Student> getStudents() {
        return studentRepo.findAll();
    }

    public Student getStudent(String id) {
        return studentRepo.findById(id).get();
    }

    public String updateStudent(String id, Student student) {
        studentRepo.save(student);
        return "updated";
    }

    public String deleteStudent(String id) {
        studentRepo.deleteById(id);
        return "student deleted";
    }
}
