package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.tipocoche;

@Repository
public interface tipococherepository extends JpaRepository<tipocoche, Long> {

}
