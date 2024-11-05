package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.tipocoche;

public interface tipococheservice {
	tipocoche create(tipocoche a);
	tipocoche update(tipocoche a);
	void delete(Long id);
	Optional<tipocoche>read(Long id);
	List<tipocoche>readAll();
}
