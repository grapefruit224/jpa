package com.example.springdatajpaexample.service;

import com.example.springdatajpaexample.domain.Students;
import com.example.springdatajpaexample.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Students> selectAllStudents(){
        return studentRepository.findByName("와랄라");
//        return studentRepository.findAll();
    }

    public Students insertStudent(Students students){
        return studentRepository.save(students);
    }
}
