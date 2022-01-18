package com.coderhouse.h2;

import com.coderhouse.h2.model.Category;
import com.coderhouse.h2.model.User;
import com.coderhouse.h2.repository.CategoryRepository;
import com.coderhouse.h2.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class H2Application {

	public static void main(String[] args) {
		SpringApplication.run(H2Application.class, args);
	}

	@Bean
	public CommandLineRunner loadData(UserRepository repository) {
		return (args) -> {
			repository.save(new User("Jose", 24));
			repository.save(new User("Esteban", 27));
			repository.save(new User("Juan", 35));
		};
	}

	}