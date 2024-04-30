package com.global.studentsystem.service;

import com.global.studentsystem.model.Student;
import com.global.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
