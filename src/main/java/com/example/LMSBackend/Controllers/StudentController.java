package com.example.LMSBackend.Controllers;


import com.example.LMSBackend.Models.Student;
import com.example.LMSBackend.RequestDto.StudentRequuestDto;
import com.example.LMSBackend.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {


    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    public ResponseEntity<String> createStudent(@RequestBody StudentRequuestDto studentRequuestDto){
        String res = studentService.createStudent(studentRequuestDto);
        return new ResponseEntity<>(res, HttpStatus.CREATED);
    }
}
