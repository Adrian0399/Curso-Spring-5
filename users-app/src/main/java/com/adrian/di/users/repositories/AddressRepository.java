package com.adrian.di.users.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.adrian.di.users.entities.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {

}
