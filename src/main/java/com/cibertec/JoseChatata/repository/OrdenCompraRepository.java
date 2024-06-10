package com.cibertec.JoseChatata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cibertec.JoseChatata.models.OrdenCompra;

public interface OrdenCompraRepository extends JpaRepository<OrdenCompra, Long> {

	@Query("SELECT o FROM OrdenCompra o WHERE YEAR(o.fechacompra) = :year AND o.usuario.nombre = :usuario")
	List<OrdenCompra> getAllByYearAndUsuario(Integer year, String usuario);
}
