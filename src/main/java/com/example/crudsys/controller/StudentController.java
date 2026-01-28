package com.example.crudsys.controller;
import com.example.crudsys.model.Student;
import com.example.crudsys.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;
    //Creat
    @PostMapping()
    public Student addStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    //Read all
    @GetMapping("/getAll")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    //Read By ID

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {

        return studentService.getStudent(id);

    }

    //Delete
    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }

    //Update
    @PutMapping("/{id}")
    public Student editStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

}