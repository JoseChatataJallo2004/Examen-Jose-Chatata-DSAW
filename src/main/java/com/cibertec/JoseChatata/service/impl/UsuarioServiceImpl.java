package com.cibertec.JoseChatata.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.JoseChatata.models.Usuario;
import com.cibertec.JoseChatata.repository.UsuarioRepository;
import com.cibertec.JoseChatata.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {


	@Autowired
	UsuarioRepository usuariorepository;
	
	@Override
	public Long create(Usuario users) {
		// TODO Auto-generated method stub
		
		Usuario newid=usuariorepository.save(users);
		
		return newid.getId();
	}

	@Override
	public List<Usuario> getAll() {
		// TODO Auto-generated method stub
		return usuariorepository.findAll();
	}

}
