package com.example.aptcodetest.service;

import com.example.aptcodetest.model.User;
import com.example.aptcodetest.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
