package com.BikkadIT.UserManagementApplication.Repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.UserManagementApplication.entities.StateMaster;
@Repository
public interface StateRepository extends JpaRepository<StateMaster,Serializable> {

	
}
