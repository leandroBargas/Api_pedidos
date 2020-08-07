package com.leandrobargas.Api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leandrobargas.Api.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
