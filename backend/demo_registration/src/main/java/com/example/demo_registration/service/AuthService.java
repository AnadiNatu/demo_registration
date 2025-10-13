package com.example.demo_registration.service;

import com.example.demo_registration.dto.UserDetailDTO;
import com.example.demo_registration.dto.UserSignUpDTO;
import com.example.demo_registration.entity.Users;
import com.example.demo_registration.mapper.DemoMapper;
import com.example.demo_registration.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    private DemoMapper mapper;

    public AuthService(DemoMapper mapper) {
        this.mapper = mapper;
    }

    public UserDetailDTO signUp(UserSignUpDTO signUpDTO){

        Users users = mapper.toUserEntity(signUpDTO);

        Users savedUser = userRepository.save(users);

        return mapper.toUserDetailDTO(savedUser);
    }
}
