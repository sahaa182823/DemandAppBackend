package com.cognizant.demandService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.demandService.pojo.UserProfile;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Integer>{
	
	@Query(value = "SELECT demand_schema.user_profile.role FROM demand_schema.user_profile where demand_schema.user_profile.user_name=?1 and demand_schema.user_profile.password=?1", nativeQuery = true)
	String validateUser(String userName, String password);

}
