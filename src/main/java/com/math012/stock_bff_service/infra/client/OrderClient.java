package com.math012.stock_bff_service.infra.client;

import com.math012.stock_bff_service.business.dto.order.OrderResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "order", url = "${order.url}")
public interface OrderClient {

    @PostMapping("/send")
    OrderResponseDTO sendEventRequestingProduct(@RequestBody OrderResponseDTO dto, @RequestHeader("Authorization")String token);
}