package com.movie.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.movie.test.domain.dto.SignupDataDTO;
import com.movie.test.domain.entity.MemberRepository;
import com.movie.test.service.LonginService;

@Service
public class LonginServiceProc implements LonginService {

	@Autowired //fixme 클래스에 롬복 어노테이션 사용해서 @Autowired는 생략 가능하니 참고해주세요.
	MemberRepository repository; //fixme 특별한 이유가 없다면 접근제어는 가능한 엄격하게 해주세요. private
	
	@Override
	public void save(SignupDataDTO dto, Model model) { //Model 클래스가 서비스 레이어까지 침범하는게 적절하지 않은거같아요 model.addAttribute는 컨트롤러에서 하는게 어
		 
		repository.save(dto.toEntity());
		model.addAttribute("logData", dto);
		
	}
	
	

}
