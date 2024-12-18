package com.example.quiz;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    @Query(value = "SELECT * FROM QUESTIONS ORDER BY RAND() LIMIT:count",nativeQuery = true)
    List<Question> findRandomQuestions(@Param("count") int count);
    //jpa provides crud methods automatically
}




