package com.math012.stock_bff_service.business.dto.security;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class UserRequestDTO {
    private String email;
    private String password;
}