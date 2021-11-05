package com.serviciorest.server.service;

import java.util.List;
import java.util.Optional;

import com.serviciorest.server.entity.Categoria;

public interface CategoriaService {
	
	
	public abstract Categoria registrarActualizar(Categoria bean);
	public abstract void eliminar(Integer cod);
	public abstract List<Categoria> listar();
	public abstract Optional<Categoria> buscar(Integer cod);
	
	//public abstract List<Categoria> listarBusqueda(Integer cod);
	

}
