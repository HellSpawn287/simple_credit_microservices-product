package com.hellspawn287.simple_credit_microservicesproduct.repositories;

import com.hellspawn287.simple_credit_microservicesproduct.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    @Override
    Optional<Product> findById(Long aLong);
}