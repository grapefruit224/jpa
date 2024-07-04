package com.example.springdatajpaexample.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity     //Entity에 setter 지양. 영속성 깨져서 실제 db에 저장될 가능성.
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STUDENT_ID")
    private Long id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private String address;

    public Students(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

