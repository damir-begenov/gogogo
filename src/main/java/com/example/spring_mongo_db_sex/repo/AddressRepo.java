package com.example.spring_mongo_db_sex.repo;

import com.example.spring_mongo_db_sex.entity.Address;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressRepo extends MongoRepository<Address,String> {
}
