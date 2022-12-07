package com.example.spring_mongo_db_sex.controller;

import com.example.spring_mongo_db_sex.entity.Student;
import com.example.spring_mongo_db_sex.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@AllArgsConstructor
public class MyController {
    private final StudentService service;
    @GetMapping("/students")
    public List<Student> showAllStudents(){
        return service.getAllStudents();
    }

    @PostMapping("/addStudent")
    public Student saveStudent(@RequestBody Student student){
        student.setCreated(LocalDateTime.now());
        service.saveStudent(student);
        return student;
    }
    @GetMapping("/students/{id}")
    public List<Student> getStudentById(@PathVariable String id){
        List<Student> student = service.getStudentByID(id);
        return student;
    }
    @GetMapping("/sex")
    public String helloPage(Model model){
        List<Student> students = service.getAllStudents();
        model.addAttribute("students",students);
        return "hello";
    }


}
