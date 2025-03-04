package com.amigos_ex.demo;

import com.amigos_ex.demo.Student.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @GetMapping()
    public List<student> getStudents()
    {
        return studentRepository.findAll();
//        return List.of(new student(1,"prateek",26));
    }

    public void addNewStudent(student s) {
        System.out.println("**************** student ******************");
    }
}
