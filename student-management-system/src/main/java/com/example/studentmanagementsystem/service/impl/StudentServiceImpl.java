package com.example.studentmanagementsystem.service.impl;

import java.util.List;

import javax.print.StreamPrintService;

import com.example.studentmanagementsystem.entity.Student;
import com.example.studentmanagementsystem.repository.StudentRepository;
import com.example.studentmanagementsystem.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;

    //@Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }


    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }


    @Override
    public Student updateStudent(Long id, Student student) {
        Student existingStudent = getStudentById(id);
        existingStudent.setId(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());
        studentRepository.save(existingStudent);
        return existingStudent;
    }


    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id); 
    }
    
}
