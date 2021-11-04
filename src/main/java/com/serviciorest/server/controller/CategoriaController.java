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

import com.serviciorest.server.entity.Categoria;
import com.serviciorest.server.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping("/lista")
	public List<Categoria> listar() throws Exception{
		return categoriaService.listar();
	}
	
	@GetMapping("/buscar/{id}")
	public Categoria bucar(@PathVariable("id") Integer cod) throws Exception{
		return categoriaService.buscar(cod);
	}
	
	@PostMapping("/registrar")
	public void registrar(@RequestBody Categoria cat) throws Exception{
		categoriaService.registrar(cat);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Categoria cat) throws Exception{
		categoriaService.actualizar(cat);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer cod) throws Exception{
		categoriaService.eliminar(cod);
	}
	
	
	
}
