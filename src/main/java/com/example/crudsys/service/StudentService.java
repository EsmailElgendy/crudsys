package com.example.crudsys.service;
import com.example.crudsys.model.Student;
import com.example.crudsys.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.crudsys.exceptions.StudentNotFoundException;
import com.example.crudsys.exceptions.NoStudentException;

@Service
@RequiredArgsConstructor
public class StudentService {


    private final  StudentRepository studentRepository;

    //Creat

    public Student createStudent( Student student) {

        if(studentRepository.existsByEmail(student.getEmail())) {
            throw new RuntimeException("Email already used");
        }
        return studentRepository.save(student);
    }

    //Read by ID

    public Student getStudent(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(id));
    }
    //Read all
    public List<Student> getAllStudents() {

        List<Student> students = studentRepository.findAll();

        if (students.isEmpty()) {
            throw new NoStudentException("Database is empty! No students found.");
        }
        return students;
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
