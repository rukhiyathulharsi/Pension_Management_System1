package com.mongo.example.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.example.entity.Pension;

public interface IPensionRepo extends MongoRepository<Pension, Integer>{

}
