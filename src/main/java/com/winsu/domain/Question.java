package com.winsu.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionId;
    private String questionText;
    private String type; // TIME_BASED, NON_TIME_BASED
    private LocalDateTime activeStartTime;
    private LocalDateTime activeEndTime;
    private String options; // JSON or comma-separated
    private String correctAnswer;

    @ManyToOne
    @JoinColumn(name = "eventId")
    private Event event;
}