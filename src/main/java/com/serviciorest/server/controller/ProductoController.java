package com.serviciorest.server.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/servicio/producto")
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/lista")
	public ResponseEntity<List<Producto>> lista(){
		return ResponseEntity.ok(productoService.listar());
	}
	
	@PostMapping("/registrar")
	public ResponseEntity<Producto> registrar(@RequestBody Producto bean){
		return ResponseEntity.ok(productoService.registrarActualizar(bean));
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<Producto> actualizar(@RequestBody Producto bean) {
		return ResponseEntity.ok(productoService.registrarActualizar(bean));
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<String> eliminar(@PathVariable("id") Integer cod){
		Optional<Producto> obj = productoService.buscar(cod);
		if(obj.isPresent()) {
			productoService.eliminar(cod);
			return ResponseEntity.ok().build();
		}else {
			return ResponseEntity.badRequest().build();
		}
		
	}
	
	/*@GetMapping("/buscar/{id}")
	public Producto bucar(@PathVariable("id") Integer cod){
		return productoService.buscar(cod);
	}*/
	@GetMapping("/buscar/{id}")
	public ResponseEntity<Producto> bucar(@PathVariable("id") Integer cod){
		Optional<Producto> obj = productoService.buscar(cod);
		if(obj.isPresent()) { 
			productoService.buscar(cod);
			return ResponseEntity.ok().build();
			
		}else {
			return ResponseEntity.badRequest().build();
		}
	}
	

}
