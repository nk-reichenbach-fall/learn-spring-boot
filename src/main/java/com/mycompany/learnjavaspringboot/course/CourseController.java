package com.mycompany.learnjavaspringboot.course;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> getAllCourses() {
        return List.of(
                new Course(1L, "Learn AWS", "Course Man"),
                new Course(2L, "Learn DevOps", "Couirse Man"));
    }
}
