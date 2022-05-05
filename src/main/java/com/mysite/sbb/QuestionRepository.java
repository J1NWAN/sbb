package com.mysite.sbb;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// JpaRepository를 상속할 때는 제네릭스 타입으로 리포지터리의 대상이 되는 엔티티의 타입과 해당 엔티티의 PK의 속성을 지정해야 한다. (규칙임)
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    // where 조건으로 subject를 추가하여 조회
    Question findBySubject(String subject);

    // where 조건으로 subject, content를 추가하여 조회
    Question findBySubjectAndContent(String subject, String content);

    // 특정 문자열이 포함되어 있는 데이터를 조회
    List<Question> findBySubjectLike(String subject);
}
