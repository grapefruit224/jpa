package com.example.springdatajpaexample.domain;

import jakarta.persistence.*;

@Entity
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private String address;
}
