package com.math012.stock_bff_service.controller;

import com.math012.stock_bff_service.business.dto.security.UserRequestDTO;
import com.math012.stock_bff_service.business.dto.security.UserResponseDTO;
import com.math012.stock_bff_service.business.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationService service;

    @PostMapping("/register")
    public ResponseEntity<UserResponseDTO> register(@RequestBody UserRequestDTO userRequestDTO){
        return ResponseEntity.ok(service.register(userRequestDTO));
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserRequestDTO userRequestDTO){
        return ResponseEntity.ok(service.login(userRequestDTO));
    }
}