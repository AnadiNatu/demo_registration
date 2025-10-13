package com.example.demo_registration.mapper;

import com.example.demo_registration.dto.UserDetailDTO;
import com.example.demo_registration.dto.UserSignUpDTO;
import com.example.demo_registration.entity.Users;
import com.example.demo_registration.enums.UserRoles;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@Component
public class DemoMapper {

    public Users toUserEntity(UserSignUpDTO signUpDTO){

        Users users = new Users();

        users.setFullName(signUpDTO.getFullName());
        users.setDateOfBirth(convertToLocalDateTime(signUpDTO.getDateOfBirth()));
        users.setGender(signUpDTO.getGender());
        users.setNationality(signUpDTO.getNationality());
        users.setContactNumber(signUpDTO.getContactNumber());
        users.setEmailId(signUpDTO.getEmailId());
        users.setAddress(signUpDTO.getAddress());
        users.setPreviousEducation(signUpDTO.getPreviousEducation());
        users.setPercentage(signUpDTO.getPercentage());
        users.setTwelfthMarkSheet(signUpDTO.getTwelfthMarkSheet());
        users.setCourseApplying(signUpDTO.getCourseApplying());
        users.setPermissionFlag(signUpDTO.getPermissionGiven().equalsIgnoreCase("yes"));
        users.setUserRole(UserRoles.STUDENT);

        return users;
    }

    public static LocalDateTime convertToLocalDateTime(Date date){
        if (date == null){
            return null;
        }

        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    public UserDetailDTO toUserDetailDTO(Users signUpDTO){

        UserDetailDTO users = new UserDetailDTO();

        users.setFullName(signUpDTO.getFullName());
        users.setDateOfBirth(convertToDate(signUpDTO.getDateOfBirth()));
        users.setGender(signUpDTO.getGender());
        users.setNationality(signUpDTO.getNationality());
        users.setContactNumber(signUpDTO.getContactNumber());
        users.setEmailId(signUpDTO.getEmailId());
        users.setAddress(signUpDTO.getAddress());
        users.setPreviousEducation(signUpDTO.getPreviousEducation());
        users.setPercentage(signUpDTO.getPercentage());

        return users;
    }

    public static Date convertToDate(LocalDateTime localDateTime){
        if (localDateTime == null){
            return null;
        }

        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

}
