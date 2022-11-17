package edu.miu.ea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import edu.miu.ea.dto.ProductDTO;
import edu.miu.ea.model.User;
import edu.miu.ea.service.IUserService;
import edu.miu.ea.service.ProductClient;

@RestController
@RequestMapping("/users")
public class UserController {
    @Value("host")
    String host;

    @Autowired
    private IUserService userService;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ProductClient productClient;

    @GetMapping
    public List<User> getAllUsers() {
        var result = restTemplate.getForObject("http://product-service/products/1", ProductDTO.class);
        System.out.println(result);
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @GetMapping("/products")
    public List<ProductDTO> getProducts() {
        return productClient.getAllProducts();
    }

}
