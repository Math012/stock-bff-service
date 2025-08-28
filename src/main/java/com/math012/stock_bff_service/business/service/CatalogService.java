package com.math012.stock_bff_service.business.service;

import com.math012.stock_bff_service.infra.client.CatalogClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class CatalogService {

    @Autowired
    private CatalogClient client;

    public Map<String, Object> findAllProductsByCategory(String category, int page, int size){
        return client.findAllProductsByCategory(category,page,size);
    }
}