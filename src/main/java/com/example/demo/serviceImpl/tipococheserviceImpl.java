package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.tipocochedao;
import com.example.demo.entity.tipocoche;
import com.example.demo.service.tipococheservice;
@Service
public class tipococheserviceImpl implements tipococheservice{
 @Autowired
 
 private tipocochedao dao;
	@Override
	public tipocoche create(tipocoche a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public tipocoche update(tipocoche a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<tipocoche> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<tipocoche> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
