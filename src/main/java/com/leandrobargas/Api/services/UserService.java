package com.leandrobargas.Api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.leandrobargas.Api.entities.User;
import com.leandrobargas.Api.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository respository;
	public List<User> findAll(){
		return respository.findAll();
		
	}
	
	public User findById(Long id) {
		Optional<User> obj = respository.findById(id);
		return obj.get();
		
	}
	
}
