package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.marca;

public interface marcadao {
	marca create(marca a);
	marca update(marca a);
	void delete(Long id);
	Optional<marca>read(Long id);
	List<marca>readAll();

}
