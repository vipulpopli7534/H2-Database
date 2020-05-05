package com.vipul.springframework.spring5web.controllers;

import com.vipul.springframework.spring5web.dataservice.AuthorService;
import com.vipul.springframework.spring5web.dataservice.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelController {
    private final BookService bookService;
    private final AuthorService authorService;

    public ModelController(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @RequestMapping("/getBooks")
    public String getBooks(Model model){
        model.addAttribute("books", bookService.findAll());
        return "books";
    }

    @RequestMapping("/getAuthors")
    public String getAuthors(Model model){
        model.addAttribute("authors", authorService.findAll());
        return "authors";
    }
}
