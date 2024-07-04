package com.example.springdatajpaexample.repository;

import com.example.springdatajpaexample.domain.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Students, Long> {
//    <S extends T> List<S> saveAll(Iterator );

    List<Students> findAll();

    List<Students> findByName(String name);
}
