package com.math012.stock_bff_service.controller;

import com.math012.stock_bff_service.business.dto.order.OrderResponseDTO;
import com.math012.stock_bff_service.business.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping("/send")
    public ResponseEntity<OrderResponseDTO> sendEventRequestingProduct(@RequestBody OrderResponseDTO dto, @RequestHeader("Authorization")String token){
        return ResponseEntity.ok( service.sendEventRequestingProduct(dto,token));
    }
}