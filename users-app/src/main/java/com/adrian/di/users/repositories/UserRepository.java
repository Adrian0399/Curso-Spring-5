package com.adrian.di.users.repositories;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adrian.di.users.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	public Optional<User> findByUsername(String username);
	
	public Optional<User> findByUsernameAndPassword(String username, String password);
	
	/*
	 * Esto NO es SQL, se llama JPQL Java Persinstence Query Lenguaje
	 */
	@Query("SELECT u.username FROM User u")
	public Page<String> findUsername(PageRequest pageRequest);
}
