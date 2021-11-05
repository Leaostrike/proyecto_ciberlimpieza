package com.serviciorest.server.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serviciorest.server.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
	
	//List<Categoria> findById(Integer cod);
	//Optional<Categoria> findById(Integer id);

}
