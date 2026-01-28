package com.example.crudsys.service;
import com.example.crudsys.model.Student;
import com.example.crudsys.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    //Creat

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    //Read by ID

    public Student getStudent(Long id) {
        return studentRepository.getById(id);
    }
    //Read all
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    //Update
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    //Delete
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);

    }

}
