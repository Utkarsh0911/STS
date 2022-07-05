package com.example.devops;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/status/check")
	public User getStatus() {
		User user=new User();
		user.setAge(25);
		user.setBaseBranch("New Delhi");
		user.setCompany("Tata Consultancy Services");
		user.setDesignation("Systems Engineer");
		user.setFatherName("SK Sharma");
		user.setId(1825676);
		user.setLocation("Noida STP");
		user.setName("Utkarsh Sharma");
		user.setPermanentAddress("Meerut");
		user.setSkills("Java/Python");
		return user;
	}

}
