package com.willianprates.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.willianprates.spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
