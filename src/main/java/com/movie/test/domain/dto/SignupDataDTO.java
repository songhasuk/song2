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
	
	//fixme 서버단에서 검증하는 로직이 안보이네요 @Valid 어노테이션 관련을 이용해서 간단한 검증로직을 추가할수도 있으니 참고해주세요
	private String email;
	private String pass;
	private String nickName;
	
	//fixme 저는 DTO가 entity 클래스를 알필요가 없을거같아요. 컨버팅이 필요하면 별도 컨버팅 클래스를 만드는게 어떨까요??
	// 지금은 SignupDataDTO랑 1대1로 매핑되어 보이니 적절해보여도, 다른 모델들과 합성해서 만들어야하는 로직이 생길수도 있어요.
	public Member toEntity() { 
		return Member.builder()
				.email(email).pass(pass).nickName(nickName)
				.build();
	}
	

}
