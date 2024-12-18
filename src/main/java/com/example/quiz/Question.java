package com.example.quiz;

import jakarta.persistence.*;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String question;

    @ElementCollection
    private String[] options;
    private String answer;

    public Question(){}; //required for jpa

    public Question(String question, String[] options, String answer){
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getQuestion(){
        return question;
    }
    public void setQuestion(String question){
        this.question = question;
    }
    public String getAnswer(){
        return answer;
    }
    public void setAnswer(String answer){
        this.answer = answer;
    }
    public String[] getOptions(){
        return options;
    }
    public void setOptions(String[] options){
        this.options = options;
    }
}
