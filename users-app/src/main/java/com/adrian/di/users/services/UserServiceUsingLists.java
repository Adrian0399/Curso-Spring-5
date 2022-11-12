package com.adrian.di.users.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.adrian.di.users.models.User;
import com.github.javafaker.Faker;

@Service //Service para manejar en el contexto de spring
public class UserServiceUsingLists {

	@Autowired
	private Faker faker;
	/*
	 * Código para mi servicio
	 */
	private List<User> users = new ArrayList<>();
	
	@PostConstruct
	public void init() {
		for(int i = 0; i < 100; i++) {
			//users.add(new User(nickName, username, password);
			users.add(new User(faker.funnyName().name(), faker.name().username(), faker.dragonBall().character()));
		}
	}

	public List<User> getUsers(String startWith) {
		if(startWith != null) {
			return users.stream().filter(u -> u.getUsername().startsWith(startWith)).collect(Collectors.toList());
		} else {
			return users;
		}
	}
	
	public User getUserByUsername(String username) {
		return users.stream().filter(u -> u.getUsername().equals(username)).findAny().orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User %s not found"));
		
	}
	
	public User createUser(User user) {
		if (users.stream().anyMatch(u->u.getUsername().equals(user.getUsername()))) {
			throw new ResponseStatusException(HttpStatus.CONFLICT, String.format("User %s already exists", user.getUsername()));
		}
		users.add(user);
		return user;
	}

	public User updateUser(User user, String username) {
		User userToBeUpdate = getUserByUsername(username);
		userToBeUpdate.setNickName(user.getNickName());
		userToBeUpdate.setPassword(user.getPassword());
		
		return userToBeUpdate;
	}
	
	public void deleteUser(String username) {
		User userByUsername = getUserByUsername(username);
		users.remove(userByUsername);
	}
}
