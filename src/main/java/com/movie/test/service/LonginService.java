package com.movie.test.service;

import org.springframework.ui.Model;

import com.movie.test.domain.dto.SignupDataDTO;

public interface LonginService { //fixme 클래스명 오타 같아요

	void save(SignupDataDTO dto, Model model); //fixme 로그인 서비스인데 메소드의 추상화 수준이 너무 낮은거 같아요, save가 아니라 join이나 회원가입을 의미하는 다른 이름으로 변경이 

}
