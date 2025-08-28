package com.math012.stock_bff_service.controller;

import com.math012.stock_bff_service.business.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatalogService service;

    @GetMapping("/{category}")
    public ResponseEntity<Map<String, Object>> findAllProductsByCategory(@PathVariable("category")String category,
                                                                         @RequestParam(defaultValue = "0", required = false) int page,
                                                                         @RequestParam(defaultValue = "10", required = false) int size){
        return ResponseEntity.ok(service.findAllProductsByCategory(category,page,size));
    }
}