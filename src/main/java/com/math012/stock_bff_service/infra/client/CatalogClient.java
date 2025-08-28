package com.math012.stock_bff_service.infra.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(name = "catalog", url = "${catalog.url}")
public interface CatalogClient {

    @GetMapping("/product/{category}")
    Map<String, Object> findAllProductsByCategory(@PathVariable("category")String category,
                                                                         @RequestParam(defaultValue = "0", required = false) int page,
                                                                         @RequestParam(defaultValue = "10", required = false) int size);
}