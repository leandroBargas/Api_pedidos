package com.leandrobargas.Api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leandrobargas.Api.entities.Category;
import com.leandrobargas.Api.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository respository;
	public List<Category> findAll(){
		return respository.findAll();
		
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = respository.findById(id);
		return obj.get();
		
	}
	
}
