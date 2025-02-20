package com.winsu.services;

import com.winsu.dto.QuestionDTO;
import java.util.List;

public interface QuestionService {
    QuestionDTO createQuestion(QuestionDTO questionDTO);
    QuestionDTO getQuestionById(Long id);
    List<QuestionDTO> getAllQuestions();
    QuestionDTO updateQuestion(Long id, QuestionDTO questionDTO);
    void deleteQuestion(Long id);
}
