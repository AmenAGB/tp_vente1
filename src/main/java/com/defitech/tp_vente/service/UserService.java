package com.defitech.tp_vente.service;

import com.defitech.tp_vente.modele.User;
import com.defitech.tp_vente.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
