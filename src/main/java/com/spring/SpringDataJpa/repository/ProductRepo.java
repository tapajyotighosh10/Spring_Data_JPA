package com.spring.SpringDataJpa.repository;

import com.spring.SpringDataJpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Long> {
}
