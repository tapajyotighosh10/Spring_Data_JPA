package com.spring.SpringDataJpa.repository;

import com.spring.SpringDataJpa.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductRepoTest {
@Autowired
    private ProductRepo productRepo;
@Test
    void saveMethod(){
    //create product


    Product p = new Product();
    p.setName("Samsung M35 5G.");
    p.setDescription("Samsung Monster series");
    p.setSku("100SK");
    p.setPrice(new BigDecimal(15999.00));
    p.setActive(true);
    p.setImageUrl("samsung.jpg");
    // save product
    Product savedProduct = productRepo.save(p);
    // display product info
    System.out.println(savedProduct.getId());
    System.out.println(savedProduct.toString());
}
}