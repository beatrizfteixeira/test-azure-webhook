package com.example.teste.email.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TesteWebHookController {

    @GetMapping("/api/send/myNotifyClient")
    public ResponseEntity<?> clientNotificacao() {
        return ResponseEntity.ok("Ciertoooo");
    }
}
