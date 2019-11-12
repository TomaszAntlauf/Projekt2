package com.example.demo;

import com.example.demo.db.StudentRepository;
import io.vavr.collection.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceTest {

    @Autowired
    private StudentRepository repository;

    @Test
    public void getEmptyList() {
        final StudentService service = new StudentService(repository);
        List<Student> students = service.getStudents();
        assertTrue(students.isEmpty());
    }

    @Test
    public void addStudents() {
        final StudentService service = new StudentService(repository);
        final Student created = service.addStudents(new NewStudent("Student1","1-2-3","IP"));
        assertNotNull(created);
    }

    @Test
    public void addStudentIsReturn() {
        final StudentService service = new StudentService(repository);
        final Student created = service.addStudents(new NewStudent("Student1","1-2-3","IP"));
        final List<Student> all = service.getStudents();
        assertEquals(all.get(0).name, "Student1");
    }

    @Test
    public void addStudentHasNewId() {
        final StudentService service = new StudentService(repository);
        final Student created = service.addStudents(new NewStudent("Student1","1-2-3","IP"));
        final Student created2 = service.addStudents(new NewStudent("Student2","2-2-3","IP"));

        assertNotEquals(created.id,created2.id);
        assertEquals(2,service.getStudents().size());

    }

}