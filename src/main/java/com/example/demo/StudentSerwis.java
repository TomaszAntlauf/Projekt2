package com.example.demo;

//import java.util.List;
import io.vavr.collection.List;

public class StudentSerwis {
    private List<Student> students = List.empty();
    List<Student> getStudents() {
        return students;
    }

    Student addStudents(NewStudent newstudent) {
        return new Student(1,"aa","aa","aa");

    }
}
