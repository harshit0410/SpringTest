package com.springrest.springrest.controller;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public @ResponseBody String home() {
        return "Welcome to spring Application";
    }

    @GetMapping("/courses")
    public List<Course> getCourses () {
    return  this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public  Course getCourse (@PathVariable String courseId) {
        return  this.courseService.getCourse(Long.parseLong(courseId));
    }

    @PostMapping(value = "/courses", consumes = "application/json")
    public  Course addCourse (@RequestBody Course course) {
        return this.courseService.addCourse(course);
    }

    //spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration


}
