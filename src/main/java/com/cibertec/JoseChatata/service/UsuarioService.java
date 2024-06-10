package com.cibertec.JoseChatata.service;


import java.util.List;

import com.cibertec.JoseChatata.models.Usuario;

public interface UsuarioService {

	
	Long create(Usuario users);

	List<Usuario> getAll();

}
