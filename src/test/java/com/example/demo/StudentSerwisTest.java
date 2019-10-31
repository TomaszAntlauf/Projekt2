package com.example.demo;

import io.vavr.collection.List;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentSerwisTest {

    @Test
    public void getEmptyList() {
        final StudentSerwis service = new StudentSerwis();
        List<Student> students = service.getStudents();
        assertTrue(students.isEmpty());
    }

    @Test
    public void addStudents() {
        final StudentSerwis service = new StudentSerwis();
        final Student created = service.addStudent(new NewStudent("Student1","1-2-
                3","IP"));
        assertNotNull(created);
    }

}