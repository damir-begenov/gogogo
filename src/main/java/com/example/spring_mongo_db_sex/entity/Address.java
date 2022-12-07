package com.example.spring_mongo_db_sex.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Address {
    @Id
    private String id;
    private String country;
    private String city;
    private String postCode;
}
