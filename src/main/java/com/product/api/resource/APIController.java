package com.product.api.resource;

import com.product.api.model.Result;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/products")
public class APIController {

    @Value("${product.conf.category}")
    private String productCategory;
    @GetMapping
    public ResponseEntity<Result<String>> getProducts() {
        return ResponseEntity.ok(new Result<>("0", "Request accepted.", productCategory));
    }

}
