package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;

@RestController
@RequestMapping("/punkty")
public class PunktyControler {


   StudentSerwis service = new StudentSerwis();


    @RequestMapping("/users")
    public ArrayList<Student> getUsers()
    {
        return new ArrayList<>(service.getStudents().asJava());
    }

    @PostMapping("/adduser")
    public ArrayList<String> addUser(@RequestBody NewStudent name)
    {
        return service.addStudents(name);
    }
}
