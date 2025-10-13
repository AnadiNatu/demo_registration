package com.example.demo_registration.controller;

import com.example.demo_registration.dto.UserDetailDTO;
import com.example.demo_registration.dto.UserSignUpDTO;
import com.example.demo_registration.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth/")
@CrossOrigin("*")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("signup/student")
    public ResponseEntity<?> signupEmployer(@RequestBody UserSignUpDTO request){
        UserDetailDTO dto = authService.signUp(request);

        if (dto == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Student data was not processed");
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(dto);

    }

}
