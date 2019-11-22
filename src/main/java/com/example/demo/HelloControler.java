package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;


@RestController
public class HelloControler {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String Hello(){
        return "Hello World "+ LocalDateTime.now();
    }
}

