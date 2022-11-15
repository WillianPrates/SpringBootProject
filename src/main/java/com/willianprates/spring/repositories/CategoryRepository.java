package com.willianprates.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.willianprates.spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
