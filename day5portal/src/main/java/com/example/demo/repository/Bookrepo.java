package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.Bookentity;


public interface Bookrepo extends JpaRepository<Bookentity, Integer> {

}
