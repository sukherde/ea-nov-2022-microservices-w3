package edu.miu.ea.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import edu.miu.ea.dto.ProductDTO;

@FeignClient(name = "PRODUCT-SERVICE", url = "product-service")
public interface ProductClient {
    @GetMapping("/products")
    List<ProductDTO> getAllProducts();
}
