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
	
	
	
	//fixme 같은 DTO모델을 signin과 signup에서 공유하고 있네요. 내용이 같아보여도 실제론 다른 용도의 모델이니 구분되어야합니다.
	// 만약 회원가입할때 파라미터 변경이 필요하다고 상상해보세요.
	// 회원가입 로직을 수정했는데, 로그인 로직까지 영향을 받는 안좋은 구조가 될거같아요.
	
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
