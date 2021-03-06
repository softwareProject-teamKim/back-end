package com.sw.reservation.users;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByStudentIdAndPassword(Long studentId, String password);
    Optional<User> findByStudentId(Long studentId);
}
