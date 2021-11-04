package com.serviciorest.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serviciorest.server.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
