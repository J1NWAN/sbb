package com.mysite.sbb.question;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.user.SiteUser;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 질문 엔티티
 */
@Getter @Setter @Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    /**
     * 한 질문에 여러 답변인 경우 (1:N 관계)
     * 한 질문에 여러 답변이 작성될 때 이 질문을 삭제시 모든 답변을 삭제하기 위해 속성으로 cascade = CascadeType.REMOVE를 준다
     */
    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;

    @ManyToOne
    private SiteUser author;
}
