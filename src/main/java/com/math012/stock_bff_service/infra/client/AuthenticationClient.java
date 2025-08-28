package com.math012.stock_bff_service.infra.client;

import com.math012.stock_bff_service.business.dto.security.UserRequestDTO;
import com.math012.stock_bff_service.business.dto.security.UserResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "authentication", url = "${authentication.url}")
public interface AuthenticationClient {

    @PostMapping("/register")
    UserResponseDTO register(@RequestBody UserRequestDTO userRequestDTO);

    @PostMapping("/login")
    String login(@RequestBody UserRequestDTO userRequestDTO);
}