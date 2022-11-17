package edu.miu.ea.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.miu.ea.model.Products;

@Service
public interface IProductService {
    List<Products> getAllProducts();

    Products getProductById(int id);
}
