package com.lucianodev.course.repositories;

import com.lucianodev.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
}
