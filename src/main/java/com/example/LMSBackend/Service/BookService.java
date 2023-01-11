package com.example.LMSBackend.Service;


import com.example.LMSBackend.DtoConverters.BookConverter;
import com.example.LMSBackend.Models.Author;
import com.example.LMSBackend.Models.Book;
import com.example.LMSBackend.Repository.AuthorRepository;
import com.example.LMSBackend.Repository.BookRepository;
import com.example.LMSBackend.RequestDto.BookRequestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BookService {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;
    public String createBook(BookRequestDto bookRequestDto) {

        try{
            Book book = BookConverter.convertDtoToBook(bookRequestDto);

            // set author entity
            int authorId = bookRequestDto.getAuthorId();

            //det author entity from db
            Author author = authorRepository.findById(authorId).get();

            book.setAuthor(author);

            // update book list

            List<Book> currentListOfBooks = author.getBooksWritten();

            currentListOfBooks.add(book);

            author.setBooksWritten(currentListOfBooks);

            //save author

            authorRepository.save(author);

            // save book
           // bookRepository.save(book);
        return "successfully added book";
        }
        catch (Exception e){
        log.info("createBook caused an error");
        return "caused an error";
        }

    }
}
