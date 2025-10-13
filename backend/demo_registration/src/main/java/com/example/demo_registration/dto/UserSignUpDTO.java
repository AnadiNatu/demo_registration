package com.example.demo_registration.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserSignUpDTO {

    private String fullName;

    private Date dateOfBirth;

    private String gender;

    private String nationality;

    private String contactNumber;

    private String emailId;

    private String address;

    private String previousEducation;

    private Double percentage;

    private MultipartFile twelfthMarkSheet;

    private String courseApplying;

    private String permissionGiven;

}
