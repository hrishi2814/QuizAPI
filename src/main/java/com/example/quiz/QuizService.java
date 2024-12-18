package com.example.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class QuizService {

    @Autowired
    private QuestionRepository questionRepository;

    public void initQuestions(){
        if(questionRepository.count() == 0){
            questionRepository.save(new Question("What is 2 + 2?",new String[]{"22","4","8","6"}, "4"));
            questionRepository.save(new Question("What is the capital of India",new String[]{"Mumbai","Pune","Delhi","Bangalore"},"Delhi"));
            questionRepository.save(new Question("What is 1+1",new String[]{"11","2","101","1"},"11"));
            questionRepository.save(new Question("What is the color of the sky",new String[]{"blue","yellow","white","black"},"blue"));
            questionRepository.save(new Question("How many days are in a week?",new String[]{"7","8","9","6"},"7"));
            questionRepository.save(new Question("How many days are in a month?",new String[]{"37","31","30","28"},"31"));
            questionRepository.save(new Question("How many days are in a year?",new String[]{"365","300","296","6"},"365"));
            questionRepository.save(new Question("What is 3 x 3 = ?",new String[]{"7","8","9","6"},"9"));
            questionRepository.save(new Question("How many days are in a week?",new String[]{"7","8","9","6"},"7"));
            questionRepository.save(new Question("What is 2 x 3 = ?",new String[]{"7","8","9","6"},"6"));

        }
    }

    public List<Question> getQuestion(){
        return questionRepository.findAll();
    }

    public List<Question> getRandomQuestion(int count){
        return questionRepository.findRandomQuestions(count);
    }

    public int evalAnswer(Map<Integer, String> userAnswers){
        int score = 0;
        List<Question> questions = questionRepository.findAll();
        for(Question question: questions){
            if(userAnswers.getOrDefault(question.getId(),"").equals(question.getAnswer())){}
            score++;
        }
        return score;
    }

}
