package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.marca;
import com.example.demo.service.marcaservice;

import jakarta.validation.Valid;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/marca")
public class marcacontroller {
	@Autowired
    private marcaservice service;

    @GetMapping
    public ResponseEntity<List<marca>> readAll() {
        try {
            List<marca> lista = service.readAll();
            if (lista.isEmpty()) {
                return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(lista, HttpStatus.OK);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<marca> create(@Valid @RequestBody marca obj) {
        try {
        	marca objeto = service.create(obj);
            return new ResponseEntity<>(objeto, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<marca> getmarcaById(@PathVariable Long id) {
        try {
            Optional<marca> objeto = service.read(id);
            if (objeto.isPresent()) {
                return new ResponseEntity<>(objeto.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletemarca(@PathVariable Long id) {
        try {
            service.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
  	public ResponseEntity<marca> updatemarca(@PathVariable Long id, @Valid @RequestBody marca obj) {
  	    Optional<marca> objeto = service.read(id);
  	    if (objeto.isPresent()) {
  	        // Aquí se asume que el servicio actualiza el objeto y lo retorna
  	    	marca actualizado = service.update(obj);
  	        return new ResponseEntity<>(actualizado, HttpStatus.OK);
  	    } else {
  	        return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 404 si no se encuentra el objeto
  	    }		
  	}
}
