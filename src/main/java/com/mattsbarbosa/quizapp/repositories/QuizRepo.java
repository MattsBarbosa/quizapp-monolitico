package com.mattsbarbosa.quizapp.repositories;

import com.mattsbarbosa.quizapp.models.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepo extends JpaRepository<Quiz, Integer> {
}
