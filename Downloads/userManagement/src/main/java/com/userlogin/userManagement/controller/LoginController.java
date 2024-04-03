package com.userlogin.userManagement.controller;


import com.userlogin.userManagement.modal.AdminLogin;
import com.userlogin.userManagement.security.JwtTokenSecurity;
import com.userlogin.userManagement.service.LoginService;
import org.apache.catalina.Authenticator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.AuthenticationException;
import java.util.UUID;

@RestController
public class LoginController {

    @Autowired
    private LoginService service;
    @Autowired
    JwtTokenSecurity jwtService;
    @CrossOrigin
    @PostMapping("login-admin")
    private ResponseEntity<String> loginUser(@RequestBody AdminLogin modal){
        String token=service.loginUser(modal);
        if(token!=null){
            return ResponseEntity.ok(token);
        }else{
            return ResponseEntity.badRequest().body("You are not Admin");
        }
    }




}
