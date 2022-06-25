package com.movie.test.service;

import org.springframework.ui.Model;

import com.movie.test.domain.dto.SignupDataDTO;

public interface LonginService {

	void save(SignupDataDTO dto, Model model);

}
