package com.userlogin.userManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserManagementApplication {
@PostConstruct
public void initLogin(){
	List<AdminLoginEntity> lgn= Stream.of(
			new AdminLoginEntity(1,"abhishekawasthi0597@gmail.com","1234"),
	        new AdminLoginEntity(2,"ankitawasthi0597@gmail.com","12345")
	).collect(Collectors.toList());
	adminLoginRepo.saveAll(lgn);
}
	public static void main(String[] args) {
		SpringApplication.run(UserManagementApplication.class, args);
	}

}
