package com.frances.booklist.repository;

import com.frances.booklist.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookListRepository extends JpaRepository<Book, Long>{
    List<Book> findByReader(String reader);


}
