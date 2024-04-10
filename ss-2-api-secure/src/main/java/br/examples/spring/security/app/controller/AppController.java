package br.examples.spring.security.app.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AppController {

    @GetMapping("/whoAmI")
    public ResponseEntity<String> whoAmI() {
        log.info("Request received...");
        try {
            return ResponseEntity.ok("I am a secure REST API developed in Spring Boot 3.x!!!");
        } finally {
            log.info("Request Processed!!!");
        }
    }
}
