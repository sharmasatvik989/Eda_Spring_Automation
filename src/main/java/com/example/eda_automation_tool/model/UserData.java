package com.example.eda_automation_tool.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter
public class UserData {

    private String firstName;
    private String email;
    private String lastName;
    private Date dateOfBirth;
    private Integer age;
    private Integer socialSecurityNumber;


}
