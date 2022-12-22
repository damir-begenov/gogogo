package com.example.spring_mongo_db_sex.controller;

import com.example.spring_mongo_db_sex.entity.News;
import com.example.spring_mongo_db_sex.service.Service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@Controller
@AllArgsConstructor
public class MyController {
    private final Service service;

    @GetMapping("/")
    public String helloPage(@RequestParam(name = "job" ,required = false) String job,Model model,Principal principal){
        List<News> news = service.getAllNews(job);
        model.addAttribute("news",news);
        model.addAttribute("user",service.getUserByPrincipal(principal));
        return "news";
    }
    @GetMapping("/vacancies")
    public String allvac(@RequestParam(name = "job" ,required = false) String job,Model model,Principal principal){
        List<News> news = service.getAllNews(job);
        model.addAttribute("news",news);
        model.addAttribute("user",service.getUserByPrincipal(principal));
        model.addAttribute("user",service.getUserByPrincipal(principal));
        return "vacancies";
    }
    @GetMapping("/userNews")
    public String userNews(Model model,Principal principal){
        model.addAttribute("user",service.getUserByPrincipal(principal));
        model.addAttribute("newss",service.findNewsByUserEmail(service.getUserByPrincipal(principal).getEmail()));
        return "userNews";
    }
    @GetMapping("/createvacanci")
    public String createvacanci(Principal principal,Model model){
        model.addAttribute("user",service.getUserByPrincipal(principal));
        return "createvacanci";
    }

    @PostMapping("/news/create")
    public String createVacancy(News news, Principal principal){
        service.saveNews(principal,news);
        return "redirect:/";
    }
    @GetMapping("/help")
        public String helpPage(Principal principal,Model model){
        model.addAttribute("user",service.getUserByPrincipal(principal));
        return "help";
        }
    @GetMapping("/news/{id}")
    public String newsById(@PathVariable String id ,Model model ,Principal principal){
        model.addAttribute("newss",service.getNewsById(id));
        model.addAttribute("user",service.getUserByPrincipal(principal));
        return "/news-info";
    }
    @PostMapping("/news/delete/{id}")
    public String deleteNews(@PathVariable String id){
        service.deleteNews(id);
        return "redirect:/";
    }


}
