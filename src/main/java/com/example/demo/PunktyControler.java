package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/punkty")
public class PunktyControler {


    private final StudentSerwis service;

    public PunktyControler(StudentSerwis service) {
        this.service = service;
    }


    @RequestMapping(value = "/students", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ArrayList<Student> getUsers()
    {
        return new ArrayList<>(service.getStudents().asJava());
    }

    @PostMapping(value = "/students", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Student addUser(@RequestBody NewStudent student)
    {
        return service.addStudents(student);
    }
}

