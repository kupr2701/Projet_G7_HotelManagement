package com.example.projet_g7_hotelmanagement.service;

import com.example.projet_g7_hotelmanagement.controller.dto.UserRegistrationDto;
import com.example.projet_g7_hotelmanagement.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);


}