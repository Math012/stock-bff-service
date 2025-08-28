package com.math012.stock_bff_service.business.dto.order;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class OrderResponseDTO {
    private String productName;
    private int totalQuantity;
    private double productPrice;
    private String userEmail;
}