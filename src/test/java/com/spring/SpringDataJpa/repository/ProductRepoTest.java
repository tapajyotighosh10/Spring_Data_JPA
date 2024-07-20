package com.spring.SpringDataJpa.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@DataJpaTest
class ProductRepoTest {
@Autowired
    private ProductRepo productRepo;
void saveMethod(){
    //create product
    // save product
}
}