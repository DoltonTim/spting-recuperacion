package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.tipocochedao;
import com.example.demo.entity.tipocoche;
import com.example.demo.repository.tipococherepository;
@Component
public class tipocochedaoImpl  implements tipocochedao {
@Autowired
private tipococherepository repository;
	@Override
	public tipocoche create(tipocoche a) {
		// TODO Auto-generated method stub
		return repository.save(a); 
	}

	@Override
	public tipocoche update(tipocoche a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<tipocoche> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<tipocoche> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
