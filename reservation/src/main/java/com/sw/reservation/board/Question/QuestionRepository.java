package com.sw.reservation.board.Question;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface QuestionRepository extends JpaRepository<Question, String> {
    Optional<Question> findByNo(Long no);
    void deleteByNo(Long no);
}
