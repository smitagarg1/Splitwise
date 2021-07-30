package com.udaan.expense.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udaan.expense.entity.User;

@Repository
public interface UserRepository  extends CrudRepository<User, Integer> {

	
}
