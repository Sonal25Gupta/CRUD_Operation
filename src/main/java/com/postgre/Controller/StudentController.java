package com.postgre.Controller;

import java.util.List;
import java.util.Optional;

import com.postgre.Entity.Student;
import com.postgre.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class StudentController {
    @Autowired
    private StudentRepository repository;

    @PostMapping("/addStudents")
    public String saveStudents(@RequestBody Student students) {
        repository.save(students);
        return "Added student with roll_no : " + students.getRollno();
    }

    @GetMapping("/findStudents")
    public List<Student> getStudents() {
        return repository.findAll();
    }

    @GetMapping("/findStudents/{rollno}")
    public Optional<Student> getStudent(@PathVariable Long rollno) {
        return repository.findById(rollno);
    }

    @DeleteMapping("/delete/{rollno}")
    public String deleteStudent(@PathVariable Long rollno) {
        repository.deleteById(rollno);
        return "Student deleted with rollno : " + rollno;

    }
    @PutMapping("/update/{rollno}")
    private Student update(@RequestBody Student student)
    {
        repository.save(student);
        return student;
    }
}
