package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import User.User;
import User.UserRepository;

@SpringBootApplication
public class PayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayrollApplication.class, args);
	}

    @Autowired
    private UserRepository userRepository;

    public void run(String...args) throws Exception {
        this.userRepository.save(new User("Ramesh", "Fadatare", "ramesh@gmail.com"));
        this.userRepository.save(new User("Tom", "Cruise", "tom@gmail.com"));
        this.userRepository.save(new User("Tony", "Stark", "tony@gmail.com"));
    }
}
