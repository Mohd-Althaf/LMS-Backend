package com.example.LMSBackend.DtoConverters;

import com.example.LMSBackend.Models.Book;
import com.example.LMSBackend.RequestDto.BookRequestDto;

public class BookConverter {

    public static Book convertDtoToBook(BookRequestDto bookRequestDto){
        Book book = Book.builder().name(bookRequestDto.getName())
                .genre(bookRequestDto.getGenre())
                .build();

        return book;
    }
}
