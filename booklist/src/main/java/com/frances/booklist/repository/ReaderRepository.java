package com.frances.booklist.repository;

import com.frances.booklist.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReaderRepository extends JpaRepository<Reader, String> {
    Reader findOne(String username);
}