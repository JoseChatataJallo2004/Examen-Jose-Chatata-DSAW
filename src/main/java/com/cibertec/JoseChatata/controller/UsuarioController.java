package com.cibertec.JoseChatata.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.JoseChatata.models.Usuario;
import com.cibertec.JoseChatata.service.UsuarioService;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioservice;
	
	@PostMapping
	public ResponseEntity<Map<String,Long>>  create(@RequestBody Usuario users) {
		
		Long nuevoid=usuarioservice.create(users);
		 Map<String, Long> response = new HashMap<>();
		    response.put("id", nuevoid);
		
		return new ResponseEntity<>(response,HttpStatus.CREATED);
	}
	
	
	@GetMapping
	public ResponseEntity<List<Usuario>> getAll(){
		List<Usuario> list=usuarioservice.getAll();
		
		return new ResponseEntity<List<Usuario>>(list,HttpStatus.OK);
	}
	
}
