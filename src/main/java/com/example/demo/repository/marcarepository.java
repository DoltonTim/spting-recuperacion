package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.marca;

@Repository
public interface marcarepository extends JpaRepository<marca, Long> {

}
