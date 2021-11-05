package com.serviciorest.server.service;

import java.util.List;
import java.util.Optional;

import com.serviciorest.server.entity.Producto;

public interface ProductoService {
	
	public abstract Producto registrarActualizar(Producto bean);
	public abstract void eliminar(Integer cod);
	public abstract List<Producto> listar();
	public abstract Optional<Producto> buscar(Integer cod);
	//public abstract List<Producto> listarPoId(Integer cod);
	
	
	

}
