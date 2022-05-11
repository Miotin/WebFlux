package com.example.demo.dao;

import com.example.demo.domain.EntriesData;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntriesRepository extends ReactiveMongoRepository<EntriesData, Long> {

}
