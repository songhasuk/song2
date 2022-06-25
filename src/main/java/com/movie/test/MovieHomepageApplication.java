package com.movie.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
@EnableJpaAuditing  //fixme JPA 관련 어노테이션이니 따로 설정 클래스로 관리하는게 좋을거같아요
@SpringBootApplication
public class MovieHomepageApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieHomepageApplication.class, args);
	}

}
