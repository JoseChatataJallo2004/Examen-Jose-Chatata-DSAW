package com.cibertec.JoseChatata.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.JoseChatata.models.OrdenCompra;
import com.cibertec.JoseChatata.repository.OrdenCompraRepository;
import com.cibertec.JoseChatata.service.OrdenCompraService;
@Service
public class OrdenCompraServiceImpl implements OrdenCompraService{

	
	@Autowired
	OrdenCompraRepository ordenrepository;
	
	@Override
	public Long create(OrdenCompra ordecompra) {
		// TODO Auto-generated method stub
		OrdenCompra newid=ordenrepository.save(ordecompra);
		return newid.getId();
	}

	@Override
	public List<OrdenCompra> getAll() {
		// TODO Auto-generated method stub
		return ordenrepository.findAll();
	}

	@Override
	public List<OrdenCompra> getAllByYearAndUsuario(Integer year, String usuario) {
		// TODO Auto-generated method stub
		return ordenrepository.getAllByYearAndUsuario(year,usuario);
	}

}
