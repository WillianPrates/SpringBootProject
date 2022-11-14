package com.willianprates.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.willianprates.spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
