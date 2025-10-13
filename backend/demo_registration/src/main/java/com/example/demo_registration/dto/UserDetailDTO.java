package com.example.demo_registration.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDetailDTO {

    private String fullName;

    private Date dateOfBirth;

    private String gender;

    private String nationality;

    private String contactNumber;

    private String emailId;

    private String address;

    private String previousEducation;

    private Double percentage;

}
