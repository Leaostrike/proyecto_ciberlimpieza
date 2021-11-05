package com.serviciorest.server.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
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
@RequestMapping("/servicio/categoria")
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping("/lista")
	public ResponseEntity<List<Categoria>> lista(){
		return ResponseEntity.ok(categoriaService.listar());
	}
	
	@PostMapping("/registrar")
	public ResponseEntity<Categoria> registrar(@RequestBody Categoria bean){
		return ResponseEntity.ok(categoriaService.registrarActualizar(bean));
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<Categoria> actualizar(@RequestBody Categoria bean){
		return ResponseEntity.ok(categoriaService.registrarActualizar(bean));
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<String> eliminar(@PathVariable("id") Integer id){
		Optional<Categoria> obj = categoriaService.buscar(id);
		if(obj.isPresent()) {
			categoriaService.eliminar(id);
			return ResponseEntity.ok().build();
		}else {
			return ResponseEntity.badRequest().build();
		}
	}
	
	/*
	
	@GetMapping("/buscar/{id}")
	public Categoria bucar(@PathVariable("id") Integer cod) throws Exception{
		return categoriaService.buscar(cod);
	}
	
	
	
	
	*/
	
	
	
}
