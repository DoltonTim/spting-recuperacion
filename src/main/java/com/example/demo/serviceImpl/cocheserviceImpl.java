package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.cochedao;
import com.example.demo.entity.coche;
import com.example.demo.service.cocheservice;
@Service
public class cocheserviceImpl implements cocheservice{
@Autowired
private cochedao dao;
	@Override
	public coche create(coche a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public coche update(coche a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<coche> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<coche> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
