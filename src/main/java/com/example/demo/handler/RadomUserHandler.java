package com.example.demo.handler;

import com.example.demo.dao.RadomUserRepository;
import com.example.demo.domain.RadomUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Slf4j
@Component
public class RadomUserHandler {
    private final RadomUserRepository radomUserRepository;
    @Autowired
    public RadomUserHandler(RadomUserRepository radomUserRepository) {
        this.radomUserRepository = radomUserRepository;
    }

    public Mono<RadomUser> save(RadomUser radomUser) {
        return radomUserRepository.save(radomUser);
    }
    public Mono<RadomUser> insert(RadomUser radomUser) {
        return radomUserRepository.insert(radomUser);
    }
}
