package com.oryshchych.qr.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/demo-controller")

public class DemoController {

    @GetMapping
    private ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from secured endpoint");

    }
}
