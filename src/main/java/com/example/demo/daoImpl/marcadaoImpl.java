package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.marcadao;
import com.example.demo.entity.marca;
import com.example.demo.repository.marcarepository;
@Component
public class marcadaoImpl  implements marcadao{
  @Autowired
  private marcarepository repository;
	@Override
	public marca create(marca a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public marca update(marca a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<marca> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<marca> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
