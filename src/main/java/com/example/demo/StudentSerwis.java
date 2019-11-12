package com.example.demo;

//import java.util.List;
import com.example.demo.db.StudentRepository;
import io.vavr.collection.List;
import org.springframework.stereotype.Service;

@Service
public class StudentSerwis {
   /* private List<Student> students = List.empty();
    List<Student> getStudents() {
        return this.students;
    }

    Student addStudents(NewStudent newstudent) {
        Student created = new Student(students.size() +1, newstudent.name, newstudent.number, newstudent.group);
        students=students.prepend(created);
        return created;

    }
    */
   private final StudentRepository repository;
    public StudentSerwis(StudentRepository repository) {
        this.repository = repository;
    }

    List<Student> getStudents() {
        return List.ofAll(this.repository.findAll())
                .map(dbObj->
                        new Student(
                                dbObj.getId(),
                                dbObj.getName(),
                                dbObj.getNumber(),
                                dbObj.getGroup1())
                );
    }
    Student addStudents(final NewStudent newStudent) {
        throw new UnsupportedOperationException();
    }


}
