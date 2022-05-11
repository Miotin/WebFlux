package com.example.demo.domain;

import lombok.Data;

@Data
public class RadomUser_Result {
    private String gender;
    private RadomUser_Name name;
    private RadomUser_Location location;
    private String email;
    private RadomUser_Login login;
    private RadomUser_Dob dob;
    private RadomUser_Dob registered;
    private String phone;
    private String cell;
    private RadomUser_Id id;
    private RadomUser_Pitcure picture;
    private String nat;
}
