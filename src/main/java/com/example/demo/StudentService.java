package com.example.demo;

//import java.util.List;
import com.example.demo.db.StudentRepository;
import io.vavr.collection.List;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

   private final StudentRepository repository;

   public StudentService(StudentRepository repository) {
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
