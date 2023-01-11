package com.example.LMSBackend.Service;


import com.example.LMSBackend.DtoConverters.AuthorConverter;
import com.example.LMSBackend.Models.Author;
import com.example.LMSBackend.Repository.AuthorRepository;
import com.example.LMSBackend.RequestDto.AuthorRequestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AuthorService {


    @Autowired
    AuthorRepository authorRepository;
    public String createAuthor(AuthorRequestDto authorRequestDto) {
        try {
            Author author = AuthorConverter.convertDtoToEntity(authorRequestDto);
            authorRepository.save(author);
            return "successfully created the author "+author;
        }
        catch (Exception e){
            log.info("createAuthor caused an issue");
            return "error occurred while creating the author";
        }
    }
}
