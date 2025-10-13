package com.example.demo_registration.entity;

import com.example.demo_registration.enums.UserRoles;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private LocalDateTime dateOfBirth;

    private String gender;

    private String nationality;

    private String contactNumber;

    private String emailId;

    private String address;

    private String previousEducation;

    private Double percentage;

    private MultipartFile twelfthMarkSheet;

    private String courseApplying;

    private boolean permissionFlag;

    private UserRoles userRole;

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", nationality='" + nationality + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", emailId='" + emailId + '\'' +
                ", address='" + address + '\'' +
                ", previousEducation='" + previousEducation + '\'' +
                ", percentage=" + percentage +
                ", twelveMarksheet=" + twelfthMarkSheet +
                ", courseApplying='" + courseApplying + '\'' +
                ", permissionFlag=" + permissionFlag +
                '}';
    }
}
