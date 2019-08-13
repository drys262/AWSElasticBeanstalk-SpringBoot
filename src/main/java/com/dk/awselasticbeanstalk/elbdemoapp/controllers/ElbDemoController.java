package com.dk.awselasticbeanstalk.elbdemoapp.controllers;


import com.dk.awselasticbeanstalk.elbdemoapp.entity.Product;
import com.dk.awselasticbeanstalk.elbdemoapp.services.ProductRepository;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElbDemoController {

  @Autowired
  private ProductRepository productRepository;

  @GetMapping
  public String hello() {
    return "Hello AWS Elastic Beanstalk";
  }

  @GetMapping("/products")
  public List<Product> getProducts() {
    return productRepository.findAll();
  }

  @PostMapping("/products")
  public void addProduct(@RequestBody Product product) {
    productRepository.save(product);
  }

  @DeleteMapping("/products/{id}")
  public void deleteProduct(@PathVariable UUID id) {
    productRepository.deleteById(id);
  }

  @PutMapping("/products")
  public void updateProduct(@RequestBody Product updatedProduct) {
    productRepository.save(updatedProduct);
  }


}
