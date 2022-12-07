package com.example.spring_mongo_db_sex.repo;

import com.example.spring_mongo_db_sex.entity.Address;
import com.example.spring_mongo_db_sex.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


public interface StudentRepository extends MongoRepository<Student,String> {
    public List<Student> getStudentsById(String id);

}
