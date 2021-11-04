package com.serviciorest.server.service;

import java.util.List;

import com.serviciorest.server.entity.Producto;

public interface ProductoService {
	
	void registrar(Producto bean) throws Exception;
	void actualizar(Producto bean) throws Exception;
	void eliminar(Integer cod) throws Exception;
	List<Producto> listar() throws Exception;
	Producto buscar(Integer cod) throws Exception;

}
