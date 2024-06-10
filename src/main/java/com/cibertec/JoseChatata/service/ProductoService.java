package com.cibertec.JoseChatata.service;

import java.util.List;

import com.cibertec.JoseChatata.models.Producto;

public interface ProductoService {

	Long create(Producto produc);

	List<Producto> getAll();
	
	
}
