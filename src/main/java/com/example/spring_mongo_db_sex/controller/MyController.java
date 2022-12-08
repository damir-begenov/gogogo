package com.example.spring_mongo_db_sex.controller;

import com.example.spring_mongo_db_sex.entity.News;
import com.example.spring_mongo_db_sex.entity.Student;
import com.example.spring_mongo_db_sex.service.Service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class MyController {
    private final Service service;
    @GetMapping("/students")
    public List<Student> showAllStudents(){
        return service.getAllStudents();
    }


    @GetMapping("/students/{id}")
    public List<Student> getStudentById(@PathVariable String id){
        List<Student> student = service.getStudentByID(id);
        return student;
    }
    @GetMapping("/sex")
    public String helloPage(@RequestParam(name = "job" ,required = false) String job,Model model){
        List<Student> students = service.getAllStudents();
        model.addAttribute("students",students);
        List<News> news = service.getAllNews(job);
        model.addAttribute("news",news);
        return "hello";
    }
    @PostMapping("/sex/addStudent")
    public String saveStudent(Student student){
        service.saveStudent(student);
        return "redirect:/sex";
    }
    @PostMapping("/createvacancy")
    public String createVacancy(News news){
        service.saveNews(news);
        return "redirect:/sex";
    }
    @GetMapping("/news/{id}")
    public String newsById(@PathVariable String id ,Model model ){
        model.addAttribute("newss",service.getNewsById(id));
        return "/news-info";
    }



}
