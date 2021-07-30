package com.udaan.expense.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.udaan.expense.entity.Friend;
import com.udaan.expense.entity.User;
import com.udaan.expense.service.ExpenseDividerUserService;

@RestController

@RequestMapping("/expense")
public class ExpenseDividerUserController {

	@Autowired
	ExpenseDividerUserService expenseDividerUserService;

	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	public ResponseEntity<Object> getUser(@RequestParam Integer userId) {

		try {
			User user = expenseDividerUserService.getUser(userId);

			return new ResponseEntity<>(user, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
		}

	}
	
	
	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public ResponseEntity<Object> saveUser(@RequestBody User user) {

		try {
			User user1 = expenseDividerUserService.saveUser(user);

			return new ResponseEntity<>(user1, HttpStatus.OK);
		} 
		
		catch (DataIntegrityViolationException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
		}
		 catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
		}

	}
	
	@RequestMapping(value = "/saveFriends", method = RequestMethod.POST)
	public ResponseEntity<Object> saveFriends(@RequestBody Friend user) {

		try {
			Friend user1 = expenseDividerUserService.saveFriends(user);

			return new ResponseEntity<>(user1, HttpStatus.OK);
		} 
		
		catch (DataIntegrityViolationException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
		}
		 catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
		}

	}

}
