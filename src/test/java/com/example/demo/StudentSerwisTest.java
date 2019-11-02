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
        final Student created = service.addStudents(new NewStudent("Student1","1-2-3","IP"));
        assertNotNull(created);
    }

    @Test
    public void addStudentIsReturn() {
        final StudentSerwis service = new StudentSerwis();
        final Student created = service.addStudents(new NewStudent("Student1","1-2-3","IP"));
        final List<Student> all = service.getStudents();
        assertEquals(all.get(0).name, "Student1");
    }

    @Test
    public void addStudentHasNewId() {
        final StudentSerwis service = new StudentSerwis();
        final Student created = service.addStudents(new NewStudent("Student1","1-2-3","IP"));
        final Student created2 = service.addStudents(new NewStudent("Student2","2-2-3","IP"));

        assertNotEquals(created.id,created2.id);
        assertEquals(2,service.getStudents().size());

    }

}