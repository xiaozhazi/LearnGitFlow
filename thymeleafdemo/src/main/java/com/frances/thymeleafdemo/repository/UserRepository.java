package com.frances.thymeleafdemo.repository;

import com.frances.thymeleafdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findById(long id);
    Long deleteById(long id);
}
