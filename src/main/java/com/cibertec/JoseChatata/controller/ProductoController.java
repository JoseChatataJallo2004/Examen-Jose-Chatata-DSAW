package com.cibertec.JoseChatata.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.JoseChatata.models.Producto;
import com.cibertec.JoseChatata.service.ProductoService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("producto")
public class ProductoController {
	@Autowired
	ProductoService productoservice;
	
	@PostMapping
	public ResponseEntity<Map<String ,Long>> create(@RequestBody Producto produc) {
		
		Long nuevoproducto=productoservice.create(produc);
		
		 Map<String, Long> response = new HashMap<>();
		    response.put("id", nuevoproducto);
		
		
		
		return new ResponseEntity<>(response,HttpStatus.CREATED);
	}
	
	
	@GetMapping
	public ResponseEntity<List<Producto>> getAll(){
		List<Producto> list=productoservice.getAll();
		
		return new ResponseEntity<List<Producto>>(list,HttpStatus.OK);
	}
}
