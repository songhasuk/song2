package com.movie.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.movie.test.domain.dto.SignupDataDTO;
import com.movie.test.service.LonginService;


@Controller
public class LoginController {
	
	@Autowired
	LonginService service ;
	
	//페이지 이동
	@GetMapping("signup")
	public String signupPage() {
		
		return "login/signup";
	}
	@GetMapping("signin")
	public String signinPage() {
		return "login/signin"; 
	}
	
	
	//비즈니스 로직
	@PostMapping("/login/signup")
	public String signup(SignupDataDTO dto, Model model) {
		System.out.println(dto);
		service.save(dto, model);
		return "redirect:/";
	}
	@PostMapping("/login/signin")
	public String signin(SignupDataDTO dto) {
		return "";
	}

	
}
