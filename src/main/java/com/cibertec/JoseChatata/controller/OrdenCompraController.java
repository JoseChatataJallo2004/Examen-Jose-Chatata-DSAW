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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.JoseChatata.models.OrdenCompra;
import com.cibertec.JoseChatata.service.OrdenCompraService;

@RestController
@RequestMapping("orden-compra")
public class OrdenCompraController {

	@Autowired
	OrdenCompraService ordencompraservice;
	
	@PostMapping
	public ResponseEntity<Map<String,Long>>  create(@RequestBody OrdenCompra ordecompra) {
		
		Long nuevoid=ordencompraservice.create(ordecompra);
		 Map<String, Long> response = new HashMap<>();
		    response.put("id", nuevoid);
		
		return new ResponseEntity<>(response,HttpStatus.CREATED);
	}
	
	
	@GetMapping
	public ResponseEntity<List<OrdenCompra>> getAll(){
		List<OrdenCompra> list=ordencompraservice.getAll();
		
		return new ResponseEntity<List<OrdenCompra>>(list,HttpStatus.OK);
	}
	
	
	@GetMapping("/by-year-and-usuario")
	public ResponseEntity<List<OrdenCompra>> getAllByYearAndUsuario(@RequestParam Integer year, @RequestParam String usuario)
	{
		List<OrdenCompra> list=ordencompraservice.getAllByYearAndUsuario(year,usuario);
		
		return new ResponseEntity<List<OrdenCompra>>(list,HttpStatus.OK);
	}
	
	
	
}
