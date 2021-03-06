package com.medicos.springboot.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import com.medicos.springboot.app.models.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	
	

	public Optional<User> findByEmail(String email);
	
	

	

}