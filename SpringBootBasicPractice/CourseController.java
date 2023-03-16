package com.practice.springboot.learningspringboot;


// What we will be doing is we will be creating a simple rest api

// http://localhost:8080/courses

// and when somebody hits this url it should return the following

// [
// {
//      "id": 1,
//      "name": "Learn AWS",
//      "author": "its me hi!! I am the problem its me!!!"
// }
// ]

// What we will be doing in the course controller we will be building a rest api using the annotation @RestController

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    // Here we create method and expose the link that we would want to create

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", 2000),
                new Course(2, "Learn JAVA", 2000),
                new Course(3, "Learn PYTHON", 2000),
                new Course(4, "Learn MAVEN", 2000),
                new Course(5, "Learn INTELLIJ", 2000),
                new Course(6, "Learn HINDI", 2000),
                new Course(7, "Learn FRENCH", 2000)
                );
    }

    // now we have compiling code
    // Now we want to map this URL to a specific method
    // what is the url - /courses
    // it means when we hit the url /courses we should get arraylist in return




}
