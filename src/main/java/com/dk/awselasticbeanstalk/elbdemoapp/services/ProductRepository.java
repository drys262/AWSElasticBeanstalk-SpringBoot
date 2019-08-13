package com.dk.awselasticbeanstalk.elbdemoapp.services;

import com.dk.awselasticbeanstalk.elbdemoapp.entity.Product;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, UUID> {

}
