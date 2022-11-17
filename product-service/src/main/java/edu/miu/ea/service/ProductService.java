package edu.miu.ea.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.ea.model.Products;
import edu.miu.ea.repository.ProductRepo;

@Service
public class ProductService implements IProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Products> getAllProducts() {
        List<Products> products = new ArrayList<>();
        productRepo.findAll().forEach(products::add);
        return products;
    }

    @Override
    public Products getProductById(int id) {
        return productRepo.findById(id).orElse(null);
    }

}
