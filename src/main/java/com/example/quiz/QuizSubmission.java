package com.example.quiz;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.Map;

public class QuizSubmission {
    private Map<Integer, String> answers;

    public Map<Integer, String> getAnswers(){
        return answers;
    }

    public void setAnswers(Map<Integer, String> answers){
        this.answers = answers;
    }
}
