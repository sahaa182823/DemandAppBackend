package com.cognizant.demandService.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cognizant.demandService.pojo.UserProfile;
import com.cognizant.demandService.repository.UserProfileRepository;

@Service
public class LoginService {
	
	
	@Autowired
	private UserProfileRepository userProfileRepository;

	public ResponseEntity<?> validateUser(UserProfile userProfile) {
	//	String message = "Login Successfully";
		String userName = userProfile.getUserName();
		String password = userProfile.getPassword();
		
		String role = userProfileRepository.validateUser(userName, password);
		if(null != role )
			return new ResponseEntity<>(role, HttpStatus.OK);
		else
			return new ResponseEntity<>("Invalid User", HttpStatus.NOT_FOUND);
	}
	
	

}
