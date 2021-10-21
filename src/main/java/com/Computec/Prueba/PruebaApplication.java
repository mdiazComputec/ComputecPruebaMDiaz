package com.Computec.Prueba;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.Computec.oauth2.User;
import com.Computec.oauth2.UserRepository;

@SpringBootApplication(scanBasePackages={"com.service.something","com.service.application"}) 
public class PruebaApplication {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;
	public static void main(String[] args) {
		SpringApplication.run(PruebaApplication.class, args);
	}

	public void run(String... args) throws Exception {
		if (this.userRepository.findByUsername("martin") == null) {
			User user = new User("Martin Diaz", "martin", passwordEncoder.encode("m123"), Arrays.asList("ADMIN"));
			this.userRepository.save(user);
		}
	}
}
