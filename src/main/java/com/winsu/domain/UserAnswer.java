package com.winsu.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class UserAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userAnswerId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "questionId")
    private Question question;

    private String selectedOption;
    private boolean isCorrect;
}