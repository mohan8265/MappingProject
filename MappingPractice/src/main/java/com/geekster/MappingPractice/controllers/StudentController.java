package com.geekster.MappingPractice.controllers;

import com.geekster.MappingPractice.models.Student;
import com.geekster.MappingPractice.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping()
    public String addStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping()
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable String  id){
        return studentService.getStudent(id);
    }

    @PutMapping("/{id}")
    public String updateStudent(@PathVariable String id, @RequestBody Student student){
        return studentService.updateStudent(id,student);
    }

    @DeleteMapping("/{id}")
    public String  deleteStudent(@PathVariable String  id){
        return studentService.deleteStudent(id);
    }

}
