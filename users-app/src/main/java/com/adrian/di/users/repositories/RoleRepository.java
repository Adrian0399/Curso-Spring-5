package com.adrian.di.users.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adrian.di.users.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

}
