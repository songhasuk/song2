package com.movie.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
@EnableJpaAuditing 
@SpringBootApplication
public class MovieHomepageApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieHomepageApplication.class, args);
	}

}
