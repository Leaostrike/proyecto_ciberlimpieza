package com.serviciorest.server.service;

import java.util.List;

import com.serviciorest.server.entity.Categoria;

public interface CategoriaService {
	
	void registrar(Categoria bean) throws Exception;
	void actualizar(Categoria bean) throws Exception;
	void eliminar(Integer cod) throws Exception;
	List<Categoria> listar() throws Exception;
	Categoria buscar(Integer cod) throws Exception;

}
