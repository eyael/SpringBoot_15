package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashSet;
import java.util.Set;

@Controller
public class HomeController {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    CourseRepository courseRepository;

    @RequestMapping("/")
    public String index(Model model){
        Student student = new Student();
        student.setName("Eyael");
        student.setLastname("Mekonnen");

        Course course = new Course();
        course.setFaculity("fb");
        course.setCreditHr(3);
        course.setCoursename("Science");

        Set<Course> courses = new HashSet<Course> ();
       courses.add(course);

       student.setCourses(courses);


        studentRepository.save(student);

        model.addAttribute("student", studentRepository.findAll());
        return "index";

    }
}
