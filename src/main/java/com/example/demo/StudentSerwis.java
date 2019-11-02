package com.example.demo;

//import java.util.List;
import io.vavr.collection.List;

public class StudentSerwis {
    private List<Student> students = List.empty();
    List<Student> getStudents() {
        return this.students;
    }

    Student addStudents(NewStudent newstudent) {
        Student created = new Student(students.size() +1, newstudent.name, newstudent.number, newstudent.grupa);
        students=students.prepend(created);
        return created;

    }
}
