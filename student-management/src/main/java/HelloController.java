 package com.example.student_management;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping ("/hello")
    public String sayHello() {
        return "Hello, Welcome to Spring Boot!";
    }
    @GetMapping ("/welcome")
    public String welcome() {
        return "Welcome to Student Management System";
    }
    @GetMapping ("/student")
    public Student getStudent() {
        return new Student(
                101,
                "Suraj",
                "Computer Science"
        );
    }
}
