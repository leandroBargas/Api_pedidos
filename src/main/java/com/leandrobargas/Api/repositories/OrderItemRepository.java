package com.leandrobargas.Api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leandrobargas.Api.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	

}
