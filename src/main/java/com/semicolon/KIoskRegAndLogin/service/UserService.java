package com.semicolon.KIoskRegAndLogin.service;

import com.semicolon.KIoskRegAndLogin.model.User;
import com.semicolon.KIoskRegAndLogin.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);

}
