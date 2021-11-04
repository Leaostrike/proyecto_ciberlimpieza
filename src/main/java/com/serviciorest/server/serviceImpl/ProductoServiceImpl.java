package com.serviciorest.server.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serviciorest.server.entity.Producto;
import com.serviciorest.server.repository.ProductoRepository;
import com.serviciorest.server.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired 
	private ProductoRepository repository;
	
	@Override
	public void registrar(Producto bean) throws Exception {
		repository.save(bean);	
	}

	@Override
	public void actualizar(Producto bean) throws Exception {
		repository.save(bean);
	}

	@Override
	public void eliminar(Integer cod) throws Exception {
		repository.deleteById(cod);	
	}

	@Override
	public List<Producto> listar() throws Exception {
		return repository.findAll();
	}

	@Override
	public Producto buscar(Integer cod) throws Exception {
		Producto prod;
		prod = repository.findById(cod).orElse(null);
		return prod;
	}

}
