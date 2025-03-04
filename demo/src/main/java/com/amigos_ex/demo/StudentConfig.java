package com.amigos_ex.demo;

import com.amigos_ex.demo.Student.student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner comandLineRunner(StudentRepository studentRepository) {
        return args->{
            student prateek = new student("prateek", 26);
            student punith = new student("punith", 28);

            studentRepository.saveAll(List.of(prateek, punith));
        };

    }

}
