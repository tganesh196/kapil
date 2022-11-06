package com.BikkadIT.UserManagementApplication.service;

import java.util.Map;

import com.BikkadIT.UserManagementApplication.Binding.LoginForm;

public interface UserServiceI {
	
	public String logincheck(LoginForm loginForm);

	public Map<Integer, String> getcountries();
	
}
