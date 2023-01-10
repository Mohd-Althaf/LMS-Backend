package com.example.LMSBackend.Service;


import com.example.LMSBackend.Enums.CardStatus;
import com.example.LMSBackend.Models.Card;
import com.example.LMSBackend.Models.Student;
import com.example.LMSBackend.Repository.StudentRepository;
import com.example.LMSBackend.RequestDto.StudentRequuestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    CardService cardService;

    public String createStudent(StudentRequuestDto studentRequuestDto) {
    // convert requestDto to student
try {
    Student student = new Student();
    student.setName(studentRequuestDto.getName());
    student.setAge(studentRequuestDto.getAge());
    student.setCountry(studentRequuestDto.getCountry());
    student.setEmail(studentRequuestDto.getEmail());

    Card card = new Card();
    card.setCardStatus(CardStatus.ACTIVATED);

    card.setStudentInfo(student);
    // for bi-directional relation
    student.setCard(card);


    studentRepository.save(student);

    // we will not call for cadrepository.save(card) as its a bi-directional relationship
    // it will Automatically save card in cardRepository

    return "successfully created student and card " + studentRequuestDto;
}
catch (Exception e){
    return "Student with given mailId was already added";
}
    }
}
