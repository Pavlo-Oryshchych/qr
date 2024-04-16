package com.oryshchych.qr.service;

import com.oryshchych.qr.models.UserEntity;
import com.oryshchych.qr.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public UserEntity createUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }


    public boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }
}

