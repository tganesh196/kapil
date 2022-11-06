package com.BikkadIT.UserManagementApplication.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.UserManagementApplication.Binding.LoginForm;
import com.BikkadIT.UserManagementApplication.Repositories.CityRepository;
import com.BikkadIT.UserManagementApplication.Repositories.CountryRepostiory;
import com.BikkadIT.UserManagementApplication.Repositories.StateRepository;
import com.BikkadIT.UserManagementApplication.Repositories.UserAccountRepository;
import com.BikkadIT.UserManagementApplication.entities.CountryMaster;
import com.BikkadIT.UserManagementApplication.entities.UserAccountEntity;

@Service
public class UserServiceImpl implements UserServiceI {

	@Autowired
	private UserAccountRepository userAccountRepository;

	@Autowired
	private CountryRepostiory countryRepostiory;
	
	@Autowired
	private StateRepository stateRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	
	
	@Override
	public String logincheck(LoginForm loginForm) {
		UserAccountEntity userAccountEntity = userAccountRepository.findByEmailAndPassword(loginForm.getEmail(),
				loginForm.getPassword());
		if (userAccountEntity != null) {
			String accStatus = userAccountEntity.getAccStatus();
			if (accStatus.equals("Locked")) {
				return "Your account is locked";
			} else {

				return "login successfull.  Welcome to BikkadIT";
			}
		}
		return "Creditional Are invalid";
	}



	@Override
	public Map<Integer, String> getcountries() {
		List<CountryMaster> findAll = countryRepostiory.findAll();
		Map<Integer, String> countryMap =new HashMap<Integer, String>();
		for(CountryMaster u: findAll) {
			
			
			
			
		}
		
		return null;
	}

}

