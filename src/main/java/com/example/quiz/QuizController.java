package com.example.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    //1. init sample questions in db
    @GetMapping("/init")
    public String initQuestions(){
        quizService.initQuestions();
        return "Questions initialized.";
    }

    //2. Fetch all quiz questions
    @GetMapping("/questions")
    public List<Question> getQuestions(){
        return quizService.getQuestion();
    }

    //get random questions
    @GetMapping("/random")
    public List<Question> getRandomQuestions(){
        return quizService.getRandomQuestion(5);
    }
    //3.submit answers
    @GetMapping("/submit")
    public String submitQuiz(@RequestBody QuizSubmission submission){
        int score = quizService.evalAnswer(submission.getAnswers());
        return "You scored" + score + "out of" + quizService.getQuestion().size();
    }
}
