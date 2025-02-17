package com.example.quizapp.entity;

import com.winsu.domain.Event;
import com.winsu.domain.Question;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;



@Data
@Entity
@Table(name = "correct_answer")
public class CorrectAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long correctAnswerId;

    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;

    @ManyToOne
    @JoinColumn(name = "question_id", nullable = false)
    private Question question;

    private String correctOption;
}