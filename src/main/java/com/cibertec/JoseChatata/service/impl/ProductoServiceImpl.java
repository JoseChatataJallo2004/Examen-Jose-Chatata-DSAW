package com.cibertec.JoseChatata.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.JoseChatata.models.Producto;
import com.cibertec.JoseChatata.repository.ProductoRepository;
import com.cibertec.JoseChatata.service.ProductoService;

@Service
public class ProductoServiceImpl  implements ProductoService{

	@Autowired
	ProductoRepository productorepository;
	
	@Override
	public Long create(Producto produc) {
		// TODO Auto-generated method stub
		Producto newid=productorepository.save(produc);
		
		return newid.getId();
	}

	@Override
	public List<Producto> getAll() {
		// TODO Auto-generated method stub
		return productorepository.findAll();
	}
	
	
	

}
