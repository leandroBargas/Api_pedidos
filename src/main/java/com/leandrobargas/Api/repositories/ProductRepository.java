package com.leandrobargas.Api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leandrobargas.Api.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
