package com.movie.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.movie.test.domain.dto.SignupDataDTO;
import com.movie.test.domain.entity.MemberRepository;
import com.movie.test.service.LonginService;

@Service
public class LonginServiceProc implements LonginService {

	@Autowired
	MemberRepository repository;
	
	@Override
	public void save(SignupDataDTO dto, Model model) {
		 
		repository.save(dto.toEntity());
		model.addAttribute("logData", dto);
		
	}
	
	

}
