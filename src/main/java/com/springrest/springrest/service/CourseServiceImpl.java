package com.springrest.springrest.service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements  CourseService{
//    List <Course> list;
    @Autowired
    private CourseDao courseDao;

    public  CourseServiceImpl () {
//        list = new ArrayList<>();
//        list.add(new Course(1, "A", "desc"));
//        list.add(new Course(2, "B", "desc"));
//        list.add(new Course(3, "C", "desc"));


    }
    @Override
    public List<Course> getCourses() {
//        return list;

        return  courseDao.findAll();
    }

    @Override
    public Course getCourse(long courseId) {
//        Course c = null;
//        for (Course course: list) {
//            if (course.getId() == courseId) {
//                c = course;
//                break;
//            }
//        }
//
//        return c;

        return  courseDao.findById(courseId).get();
    }

    public  Course addCourse (Course course) {
//        list.add(course);
//        return  course;
        courseDao.save(course);
        return  course;
    }

}
