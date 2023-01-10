package com.example.LMSBackend.RequestDto;

import jakarta.persistence.Column;
import lombok.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentRequuestDto {

    private int age;

    @Column(nullable = false)
    private String name;

    @Column(name = "student_email",unique = true,nullable = false)
    private String email;

    @Column(columnDefinition = "varchar(255) default 'India'")
    private String country;

}
