package com.example.spring_mongo_db_sex.service;

import com.example.spring_mongo_db_sex.entity.News;
import com.example.spring_mongo_db_sex.entity.User;
import com.example.spring_mongo_db_sex.repo.NewsRepo;
import com.example.spring_mongo_db_sex.repo.UserRepository;
import lombok.AllArgsConstructor;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@org.springframework.stereotype.Service
public class Service {

    NewsRepo newsRepo;
    UserRepository userRepository;



    public void deleteNews(String id){
         newsRepo.deleteById(id);
    }

    public News getNewsById(String id){
        return newsRepo.getNewsById(id);
    }

    public List<News> getAllNews(String job){
        if(job!=null) return newsRepo.findByJob(job);
        return newsRepo.findAll();
    }
    public News saveNews(Principal principal,News news) {
        news.setUser(getUserByPrincipal(principal));
        getUserByPrincipal(principal).setNews(Collections.singletonList(news));
        System.out.println( getUserByPrincipal(principal).getEmail());
        return newsRepo.save(news);
    }
    public User getUserByPrincipal(Principal principal) {
        if (principal == null) return new User();
        return userRepository.findByEmail(principal.getName());
    }
    public List<News> findNewsByUserEmail(String email){
        return newsRepo.findNewsByUser_Email(email);
    }

}
