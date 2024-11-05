package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.coche;

public interface cochedao {
coche create(coche a);
coche update(coche a);
void delete(Long id);
Optional<coche>read(Long id);
List<coche> readAll();
}
