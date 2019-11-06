package com.example.demo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NewStudent {
    @JsonProperty ("name") String name;
    @JsonProperty ("number") String number;
    @JsonProperty ("group") String group;

    @JsonCreator
    public NewStudent(String name, String number, String group) {
        this.name = name;
        this.number = number;
        this.group = group;

    }
}
