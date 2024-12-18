package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Users;
import com.service.UserDAO;

@RestController
@RequestMapping("/mainapp")
public class RestApp {

	@Autowired
	private UserDAO dao;

	@PostMapping("/login")
	public String loginValid(@RequestBody Users users) {
		if (dao.loginValid(users)) {
			return "Login Succes";

		} else {
			return "Login Failure";
		}

	}

	@PostMapping("/register")
	public String registerUser(@RequestBody Users users) {

		dao.registerUser(users);

		return "User Added";
	}
	@GetMapping("/loadall")
	public List<Users> loadUsers(){
		return dao.loadUsers();
	}
	@GetMapping("/find/{uname}")
	public String searchUser(@PathVariable("uname")String uname) {
		if(dao.findUser(uname)) {
			return uname + " found ";
		}
		else 
			return "user not found...!";
		
	}
	
	@DeleteMapping("/delete/{uname}")
	public String deleteUser(@PathVariable("uname")String uname) {
		if(dao.deleteUser(uname)) {
			return uname + " found and deleted";
		}
		else 
			return "user not found...!";
		
	}
}
