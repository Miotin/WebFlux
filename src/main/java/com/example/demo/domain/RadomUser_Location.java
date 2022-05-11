package com.example.demo.domain;

import lombok.Data;

@Data
public class RadomUser_Location {
    private RadomUser_Street street;
    private String city;
    private String state;
    private String country;
    private String postcode;
    private RadomUser_Coordinates coordinates;
    private RadomUser_TimeZone timezone;
}
