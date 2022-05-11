package com.example.demo.dao;

import com.example.demo.domain.RadomUser;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RadomUserRepository extends ReactiveMongoRepository<RadomUser, Long> {

}
