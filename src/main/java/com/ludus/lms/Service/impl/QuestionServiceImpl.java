package com.ludus.lms.Service.impl;

import com.ludus.lms.Service.QuestionService;
import com.ludus.lms.repository.QuestionRepository;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {

    private QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }
}
