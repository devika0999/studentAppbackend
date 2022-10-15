package com.nestdigital.student.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


    @GetMapping("/")
    public String Homepage()
    {
        return "welome to my home page";
    }

    @GetMapping("/contact")
    public String demo()
    {
        return"contact page";
    }
}
