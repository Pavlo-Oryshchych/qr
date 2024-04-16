package com.oryshchych.qr.controller;

import com.oryshchych.qr.models.UserEntity;
import com.oryshchych.qr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public ResponseEntity<String> registerUser(@RequestBody UserEntity userEntity) {
        // Проверка зарегестрирован ли емейл ранее
        if (userService.existsByEmail(userEntity.getEmail())) {
            return ResponseEntity.badRequest().body("Email already registered");
        }
        // Сохраняет нового юзера
        userService.createUser(userEntity);

        return ResponseEntity.ok("User registered successfully");
    }
}
