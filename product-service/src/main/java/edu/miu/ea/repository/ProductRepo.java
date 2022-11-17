package edu.miu.ea.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.miu.ea.model.Products;

@Repository
public interface ProductRepo extends CrudRepository<Products, Integer> {

}
