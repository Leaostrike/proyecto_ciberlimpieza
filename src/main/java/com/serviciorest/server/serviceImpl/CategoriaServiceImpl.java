package com.serviciorest.server.serviceImpl;

import java.util.List;

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
	public List<Categoria> listar() throws Exception {
		return repositoryCat.findAll();
	}

	@Override
	public void registrar(Categoria bean) throws Exception {
		repositoryCat.save(bean);
	}

	@Override
	public void actualizar(Categoria bean) throws Exception {
		repositoryCat.save(bean);
	}

	@Override
	public void eliminar(Integer cod) throws Exception {
		repositoryCat.deleteById(cod);
		
	}

	@Override
	public Categoria buscar(Integer cod) throws Exception {
		Categoria cat;
		cat = repositoryCat.findById(cod).orElse(null);
		return cat;
	}

}
