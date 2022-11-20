package com.cotemig.trabalhoback.repository;

import com.cotemig.trabalhoback.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}