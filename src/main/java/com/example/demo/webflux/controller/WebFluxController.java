package com.example.demo.webflux.controller;

import com.example.demo.dao.EntriesRepository;
import com.example.demo.dao.RadomUserRepository;
import com.example.demo.domain.Entries;
import com.example.demo.domain.EntriesData;
import com.example.demo.domain.RadomUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping(value = "/study")
public class WebFluxController {

    @Autowired
    private RadomUserRepository radomUserRepository;
    @Autowired
    private EntriesRepository entriesRepository;

    @Autowired
    private WebClient webClient;

    @GetMapping("/s01")
    public Mono<Long> getData() {
        return webClient
                .get()
                .uri("https://api.publicapis.org/entries")
                .retrieve()
                .bodyToMono(Entries.class)
                .flatMapIterable(list -> list.getEntries())
                .doOnNext(this::saveData)
                .count();
    }

    private void saveData(EntriesData entriesData) {
        if (entriesData.getCors().equals("no")) {
            entriesRepository.save(entriesData).subscribe();
        } else if (entriesData.getCors().equals("yes")) {
            WebClient
                    .create("https://randomuser.me/api/")
                    .get()
                    .retrieve()
                    .bodyToMono(RadomUser.class)
                    .flatMap(radomUserRepository::save).subscribe();
        }
    }
}
