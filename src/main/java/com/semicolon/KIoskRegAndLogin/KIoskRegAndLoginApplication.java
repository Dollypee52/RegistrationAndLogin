package com.semicolon.KIoskRegAndLogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class KIoskRegAndLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(KIoskRegAndLoginApplication.class, args);
	}


}
