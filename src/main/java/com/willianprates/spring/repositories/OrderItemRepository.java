package com.willianprates.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.willianprates.spring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}
