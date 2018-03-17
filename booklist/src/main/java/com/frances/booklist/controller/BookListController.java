package com.frances.booklist.controller;

import com.frances.booklist.entity.Book;
import com.frances.booklist.repository.BookListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class BookListController {
    private BookListRepository bookListRepository;

    @Autowired
    public BookListController(BookListRepository bookListRepository){
        this.bookListRepository = bookListRepository;
    }

    @RequestMapping(value = "/{reader}", method = RequestMethod.GET)
    public String readerBooks(@PathVariable("reader") String reader, Model model){
        List<Book> bookList = bookListRepository.findByReader(reader);
        if(bookList != null){
            model.addAttribute("books",bookList);
        }
        return "bookList";
    }

    @RequestMapping(value="/{reader}", method = RequestMethod.POST)
        public String addToReadingList(@PathVariable("reader") String reader, Book book){
        book.setReader(reader);
        bookListRepository.save(book);
        //return "redirect:/{reader}";
        return "";
    }
}
