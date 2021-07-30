package com.udaan.expense.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udaan.expense.entity.Friend;

@Repository
public interface FriendRepository  extends CrudRepository<Friend, Integer> {

	
}
