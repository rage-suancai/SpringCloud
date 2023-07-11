package com.cloud.controller;

import com.cloud.service.BookService;
import com.entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class BookController {

    @Resource
    private BookService bookService;

    @GetMapping("/api/book/{bid}")
    public Book findBookById(@PathVariable Integer bid, HttpServletRequest request) {

        System.err.println(request.getHeader("Test"));
        return bookService.getBookById(bid);

    }

}
