package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.cochedao;
import com.example.demo.entity.coche;
import com.example.demo.repository.cocherepository;

@Component
public class cochedaoImpl  implements cochedao{
      @Autowired
      private cocherepository repository;
	@Override
	public coche create(coche a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public coche update(coche a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<coche> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<coche> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
