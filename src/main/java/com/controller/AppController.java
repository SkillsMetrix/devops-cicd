package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Users;
import com.service.UserDAO;

@Controller
@RequestMapping("/mainapp")
public class AppController {

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping(path = "/register", method = RequestMethod.GET)
	@GetMapping("/register")
	public String register() {
		return "register";
	}

}
