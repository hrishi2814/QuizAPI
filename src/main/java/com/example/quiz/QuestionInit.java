package com.example.quiz;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionInit {
    @Autowired
    private QuizService quizService;

    @PostConstruct
    public void initQuestion(){
        System.out.println("Initializing Questions...");
        quizService.initQuestions();
        System.out.println("Questions initialized!");
    }
}
