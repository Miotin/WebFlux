package com.example.demo.domain;

import lombok.Data;
import reactor.core.publisher.Mono;

@Data
public class ResponseData {
    private Mono<Long> countY;
    private Mono<Long> countN;

    public ResponseData(Mono<Long> countY, Mono<Long> countN) {
        this.countY = countY;
        this.countN = countN;
    }
}
