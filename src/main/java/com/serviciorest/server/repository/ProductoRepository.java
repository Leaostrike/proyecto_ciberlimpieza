package com.serviciorest.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serviciorest.server.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
