package com.movie.test.domain.dto;

import javax.persistence.Column;

import com.movie.test.domain.entity.Member;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class SignupDataDTO {
	
	private String email;
	private String pass;
	private String nickName;
	
	
	public Member toEntity() {
		return Member.builder()
				.email(email).pass(pass).nickName(nickName)
				.build();
	}
	

}
