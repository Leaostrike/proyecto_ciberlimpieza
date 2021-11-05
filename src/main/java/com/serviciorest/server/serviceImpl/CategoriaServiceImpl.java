package com.serviciorest.server.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serviciorest.server.entity.Categoria;
import com.serviciorest.server.repository.CategoriaRepository;
import com.serviciorest.server.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService{

	@Autowired
	private CategoriaRepository repositoryCat;

	@Override
	public Categoria registrarActualizar(Categoria bean) {
		return repositoryCat.save(bean);
	}

	@Override
	public void eliminar(Integer cod) {
		repositoryCat.deleteById(cod);	
	}

	@Override
	public List<Categoria> listar() {
		return repositoryCat.findAll();
	}

	@Override
	public Optional<Categoria> buscar(Integer cod) {
		return repositoryCat.findById(cod);
	}


}
