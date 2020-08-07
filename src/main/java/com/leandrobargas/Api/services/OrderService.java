package com.leandrobargas.Api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.leandrobargas.Api.entities.Order;
import com.leandrobargas.Api.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository respository;
	public List<Order> findAll(){
		return respository.findAll();
		
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = respository.findById(id);
		return obj.get();
		
	}
}
