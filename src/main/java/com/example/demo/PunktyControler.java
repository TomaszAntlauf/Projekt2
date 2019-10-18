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


    CopyOnWriteArrayList<String> lista = new CopyOnWriteArrayList<>();


    @RequestMapping("/users")
    public ArrayList<String> getUsers()
    {
        return new ArrayList<>(lista);
    }

    @PostMapping("/adduser")
    public ArrayList<String> addUser(@RequestBody String name)
    {
        lista.add(name);
        return new ArrayList<>(lista);
    }
}
