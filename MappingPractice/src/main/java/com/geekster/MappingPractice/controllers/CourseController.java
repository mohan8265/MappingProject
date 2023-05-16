package com.geekster.MappingPractice.controllers;

import com.geekster.MappingPractice.models.Course;
import com.geekster.MappingPractice.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping()
    public String addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }
    @GetMapping()
    public List<Course> getCourses(){
        return courseService.getCourses();
    }
    @GetMapping("/{id}")
    public Course getCourse(@PathVariable String id){
        return courseService.getCourse(id);
    }
    @PutMapping("/{id}")
    public String updateCourse(@PathVariable String id,@RequestBody Course course){
        return courseService.updateCourse(id,course);
    }
    @DeleteMapping("/{id}")
    public String deleteCourse(@PathVariable String id){
        return courseService.deleteCourse(id);
    }
}
