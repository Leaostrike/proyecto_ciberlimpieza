package com.serviciorest.server.serviceImpl;

import java.util.List;
import java.util.Optional;

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
	public Producto registrarActualizar(Producto bean) {
		return repository.save(bean);
	}

	@Override
	public void eliminar(Integer cod) {
		repository.deleteById(cod);		
	}

	@Override
	public List<Producto> listar() {
		return repository.findAll();
	}

	@Override
	public Optional<Producto> buscar(Integer cod) {
		
		return repository.findById(cod);
	}

	

}
