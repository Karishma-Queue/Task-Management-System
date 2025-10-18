package com.karishma.task_management.repository;

import com.karishma.task_management.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,String> {
  Optional<User> findByEmail(String email);
}
