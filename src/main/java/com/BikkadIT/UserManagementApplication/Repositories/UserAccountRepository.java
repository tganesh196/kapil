package com.BikkadIT.UserManagementApplication.Repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.UserManagementApplication.entities.UserAccountEntity;
@Repository
public interface UserAccountRepository extends JpaRepository<UserAccountEntity, Integer> {

	public UserAccountEntity findByEmailAndPassword(String email, String password);
	
}
