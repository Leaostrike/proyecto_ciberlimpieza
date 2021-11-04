package com.serviciorest.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serviciorest.server.entity.Producto;
import com.serviciorest.server.service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/lista")
	public List<Producto> listar() throws Exception{
		return productoService.listar();
	}
	
	@PostMapping("/registrar")
	public void registrar(@RequestBody Producto p) throws Exception{
		productoService.registrar(p);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Producto p) throws Exception{
		productoService.actualizar(p);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer cod) throws Exception{
		productoService.eliminar(cod);
	}
	
	@GetMapping("/buscar/{id}")
	public Producto bucar(@PathVariable("id") Integer cod) throws Exception{
		return productoService.buscar(cod);
	}

}
