package com.oryshchych.qr.auth;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/test-endpoint")
public class DemoController {

    @GetMapping
    public ResponseEntity<String> sayHello() {
        // Get the authenticated user's details
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName(); // Get the username

        return ResponseEntity.ok("Hello, " + username + "! Welcome to the secured endpoint.");
    }
}
