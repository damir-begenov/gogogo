package com.example.spring_mongo_db_sex.service;

import com.example.spring_mongo_db_sex.entity.News;
import com.example.spring_mongo_db_sex.entity.Student;
import com.example.spring_mongo_db_sex.repo.AddressRepo;
import com.example.spring_mongo_db_sex.repo.NewsRepo;
import com.example.spring_mongo_db_sex.repo.StudentRepository;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@org.springframework.stereotype.Service
public class Service {
    StudentRepository studentRepository;
    AddressRepo addressRepo;

    NewsRepo newsRepo;

    public News getNewsById(String id){
        return newsRepo.getNewsById(id);
    }

    public List<News> getAllNews(String job){
        if(job!=null) return newsRepo.findByJob(job);
        return newsRepo.findAll();
    }

    public List<Student> getAllStudents(){
        List<Student> students = studentRepository.findAll();
        return students;
    }
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
    public News saveNews(News news) {
        return newsRepo.save(news);
    }
    public List<Student> getStudentByID(String id){
        List<Student> student = studentRepository.getStudentsById(id);
        return student;
    }
}
