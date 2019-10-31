package com.example.demo;

//import java.util.List;
import io.vavr.collection.List;

public class StudentSerwis {
    private List<Student> students = List.empty();
    List<Student> getStudents() {
        return students;
    }

    List<Student> addStudents(NewStudent newstudent) {
        throw new UnsupportedOperationException();

    }
}
