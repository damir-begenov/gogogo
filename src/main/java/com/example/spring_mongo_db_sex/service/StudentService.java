package com.example.spring_mongo_db_sex.service;

import com.example.spring_mongo_db_sex.entity.Address;
import com.example.spring_mongo_db_sex.entity.Student;
import com.example.spring_mongo_db_sex.repo.AddressRepo;
import com.example.spring_mongo_db_sex.repo.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@AllArgsConstructor
@Service
public class StudentService {
    StudentRepository studentRepository;
    AddressRepo addressRepo;

    public List<Student> getAllStudents(){
        List<Student> students = studentRepository.findAll();
        return students;
    }
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
    public List<Student> getStudentByID(String id){
        List<Student> student = studentRepository.getStudentsById(id);
        return student;
    }
}
