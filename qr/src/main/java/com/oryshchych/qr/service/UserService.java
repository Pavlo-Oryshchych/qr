package com.oryshchych.qr.service;

import com.oryshchych.qr.entity.UserEntity;
import com.oryshchych.qr.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //Заглушка для получения всех пользователей
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public UserEntity getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public UserEntity createUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
