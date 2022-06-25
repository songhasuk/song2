package com.movie.test.domain.entity; //fixme 레포지토리 클래스가 entity 패키지에 있는데 entity와 repository 개념은 분리되는게 더 좋을거같아요

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
