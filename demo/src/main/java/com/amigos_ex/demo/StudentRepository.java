package com.amigos_ex.demo;
//import java.lang.*;
import com.amigos_ex.demo.Student.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<student, Long> {


}
