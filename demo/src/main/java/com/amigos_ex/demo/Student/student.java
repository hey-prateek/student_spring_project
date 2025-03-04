package com.amigos_ex.demo.Student;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class student {

    @Id
            @SequenceGenerator(
                    name="student_sequence",
                    sequenceName="student_sequence",
                    allocationSize=1
            )
            @GeneratedValue(
                    strategy =GenerationType.SEQUENCE,
                            generator="student_sequence"
            )
    int id;
    String name;
    int age;

    // 3 constructors
    public student() {
    }
    public student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public <E> student(List<E> prateek) {
    }

    // getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    // setters
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
