package com.example.LMSBackend.Controllers;

import com.example.LMSBackend.RequestDto.BookRequestDto;
import com.example.LMSBackend.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/create")
    public String createBook(@RequestBody BookRequestDto bookRequestDto){
        return bookService.createBook(bookRequestDto);
    }

}
