package com.mycompany.learnjavaspringboot.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> getAllCourses() {
        return List.of(
                new Course(1L, "Learn AWS", "Course Man"),
                new Course(2L, "Learn DevOps", "Couirse Man"));
    }

    @GetMapping(path = "/courses/dynamic-filter")
    public MappingJacksonValue getFilteredCourses() {

        Course course = new Course(3L, "Learn React", "Meta");
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(course);

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id", "courseName");

        FilterProvider filters = new SimpleFilterProvider().addFilter("courseFilter", filter);
        mappingJacksonValue.setFilters(filters);

        return mappingJacksonValue;
    }
    
    @RequestMapping(path = "/courses/dynamic-filter-2", method = RequestMethod.GET)
    public MappingJacksonValue getFilteredCourses2() {

        Course course = new Course(3L, "Learn React", "Meta");
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(course);

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id", "courseCompany");

        FilterProvider filters = new SimpleFilterProvider().addFilter("courseFilter", filter);
        mappingJacksonValue.setFilters(filters);

        return mappingJacksonValue;
    }

    @Autowired
    private CourseConfiguration courseConfiguration;

    @RequestMapping("/configs")
    public CourseConfiguration getAllCourseConfigs() {
        return courseConfiguration;
    }

}
