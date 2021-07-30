package com.udaan.expense.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udaan.expense.entity.Friend;
import com.udaan.expense.entity.User;
import com.udaan.expense.exception.ExpenseDataAccessException;
import com.udaan.expense.repository.FriendRepository;
import com.udaan.expense.repository.UserRepository;


@Service
public class ExpenseDividerUserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	FriendRepository friendRepository;

	public User getUser(Integer userId) {

		return userRepository.findById(userId).orElseThrow(()->new ExpenseDataAccessException("Student with "+userId+" is Not Found!"));

	}
	
	
	public User saveUser(User user) {

		return userRepository.save(user);

	}
	
	public Friend saveFriends(Friend user) {

		return friendRepository.save(user);

	}

}
