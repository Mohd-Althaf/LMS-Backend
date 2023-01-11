package com.example.LMSBackend.RequestDto;


import com.example.LMSBackend.Enums.Genre;
import com.example.LMSBackend.Models.Author;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookRequestDto {

    private String name;

    private Genre genre;

    private int authorId;


}
