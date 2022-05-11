package com.example.demo.domain;

import lombok.Data;

import java.util.List;

@Data
public class RadomUser {

    private List<RadomUser_Result> results;
    private RadomUser_Info info;
}
