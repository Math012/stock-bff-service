package com.math012.stock_bff_service.business.service;

import com.math012.stock_bff_service.business.dto.security.UserRequestDTO;
import com.math012.stock_bff_service.business.dto.security.UserResponseDTO;
import com.math012.stock_bff_service.infra.client.AuthenticationClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    private AuthenticationClient client;

    public UserResponseDTO register(UserRequestDTO userRequestDTO){
        return client.register(userRequestDTO);
    }

    public String login(UserRequestDTO userRequestDTO){
        return client.login(userRequestDTO);
    }
}