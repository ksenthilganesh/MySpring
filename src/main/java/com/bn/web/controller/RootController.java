package com.bn.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bn.web.entities.User;
import com.bn.web.services.UserService;
import com.bn.web.util.*;

@RestController
public class RootController {
	
	MailSender mailSender;
	UserService userService;
	@Autowired
	public void setMailSender(MailSender mailSender){
		this.mailSender = mailSender;
	}

	@Autowired
	public void setUserService(UserService userService){
		this.userService = userService;
	}
	
	@RequestMapping("/")
	public String handleRoot()
	{
		System.out.println(mailSender);
		User user = new User();
		user.setName("Atal");
		user.setEmail("atal@success.com");
		user.setPassword("HmmIsIt?");
		userService.saveUser(user);
		return "<html><b> ARUN </b></html>";
	}
}
