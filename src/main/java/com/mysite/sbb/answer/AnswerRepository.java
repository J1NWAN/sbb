package com.mysite.sbb.answer;

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository를 상속할 때는 제네릭스 타입으로 리포지터리의 대상이 되는 엔티티의 타입과 해당 엔티티의 PK의 속성을 지정해야 한다. (규칙임)
public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}
