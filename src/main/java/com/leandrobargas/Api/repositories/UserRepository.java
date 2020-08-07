package com.leandrobargas.Api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leandrobargas.Api.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
