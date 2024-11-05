package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.marcadao;
import com.example.demo.entity.marca;
import com.example.demo.service.marcaservice;
@Service
public class marcaserviceImpl  implements marcaservice{
    @Autowired
    private marcadao dao;
	@Override
	public marca create(marca a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public marca update(marca a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<marca> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<marca> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
