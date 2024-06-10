package com.cibertec.JoseChatata.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.cibertec.JoseChatata.models.OrdenCompra;

public interface OrdenCompraService {
	Long create(OrdenCompra ordecompra);

	List<OrdenCompra> getAll();

	@Query("SELECT o FROM OrdenCompra o WHERE YEAR(o.fechacompra) = :year AND o.usuario.nombre = :usuario")
	List<OrdenCompra> getAllByYearAndUsuario(Integer year, String usuario);

}
