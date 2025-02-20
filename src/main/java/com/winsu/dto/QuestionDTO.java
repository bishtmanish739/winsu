package com.winsu.dto;

import java.time.LocalDateTime;


public class QuestionDTO {
    private Long questionId;
    private String questionText;
    private String type; // TIME_BASED, NON_TIME_BASED
    private LocalDateTime activeStartTime;
    private LocalDateTime activeEndTime;
    private String options; // JSON or comma-separated
    private String correctAnswer;
    private Long eventId; // Referencing the event instead of embedding it

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getActiveStartTime() {
        return activeStartTime;
    }

    public void setActiveStartTime(LocalDateTime activeStartTime) {
        this.activeStartTime = activeStartTime;
    }

    public LocalDateTime getActiveEndTime() {
        return activeEndTime;
    }

    public void setActiveEndTime(LocalDateTime activeEndTime) {
        this.activeEndTime = activeEndTime;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }
}
