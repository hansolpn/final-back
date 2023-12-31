package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HealthCheck {
    @GetMapping("/")
    public ResponseEntity<?> HealthCheck() {
        log.info("server is running... I'm Healthy");
        return ResponseEntity.ok().body("It's OK~!");
    }
}
