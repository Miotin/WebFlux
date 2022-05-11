package com.example.demo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class PapTest {
    @Id
    private String api;
    private String description;
    private String auth;
    private boolean https;
    private String cors;
    private String link;
    private String Category;
}
