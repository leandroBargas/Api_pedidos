package com.leandrobargas.Api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leandrobargas.Api.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
