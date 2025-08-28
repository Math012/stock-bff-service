package com.math012.stock_bff_service.business.service;

import com.math012.stock_bff_service.business.dto.order.OrderResponseDTO;
import com.math012.stock_bff_service.infra.client.OrderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderClient client;

    public OrderResponseDTO sendEventRequestingProduct(OrderResponseDTO dto,String token){
        return client.sendEventRequestingProduct(dto,token);
    }
}