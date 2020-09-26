package com.capgemini.User2.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.client.RestTemplate;

import com.capgemini.User2.entity.User;

@ContextConfiguration
public class RegisterTest {
	     
		   RestTemplate template;
			
			@BeforeEach
			public void setUp()
			{
				template=new RestTemplate();		
			}
			
			@Test
			public void register() {
				User user=new User();
				user.setUserId("102");
			user.setUserName("prerna singh");
			user.setUserPassword("prerna singh");		
			user.setContact("3241567890");
			user.setEmail("prernasingh@gmail.com");
			user.setUserType("admin");
				
				User user1=template.postForObject
						("http://localhost:8887/User/addUser", 
						user, User.class);
				Assertions.assertNotNull(user1);
				System.out.println("Add User Working "+user1);
				
			}
			

}
