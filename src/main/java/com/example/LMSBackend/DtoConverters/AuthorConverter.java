package com.example.LMSBackend.DtoConverters;

import com.example.LMSBackend.Models.Author;
import com.example.LMSBackend.RequestDto.AuthorRequestDto;

public class AuthorConverter {

    public static Author convertDtoToEntity(AuthorRequestDto authorRequestDto){
        Author author = Author.builder().age(authorRequestDto.getAge())
                .email(authorRequestDto.getEmail())
                .country(authorRequestDto.getCountry())
                .name(authorRequestDto.getName())
                .build();
        return author;
    }


}
