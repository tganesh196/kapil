package com.BikkadIT.UserManagementApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.UserManagementApplication.Binding.LoginForm;
import com.BikkadIT.UserManagementApplication.service.UserServiceI;
import com.BikkadIT.UserManagementApplication.service.UserServiceImpl;

@RestController
public class LoginController {

	@Autowired
	private UserServiceI userServiceI;
	
	@PostMapping("/login")
	public ResponseEntity<String> loginuser(@RequestBody LoginForm loginForm){
		String logincheck = userServiceI.logincheck(loginForm);
		return new ResponseEntity<String>(logincheck, HttpStatus.OK);
		
	} 
}
