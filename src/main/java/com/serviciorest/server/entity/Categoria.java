package com.serviciorest.server.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_cate_produc")
@Getter
@Setter
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcate")
	private int idCategoria;
	
	@Column(name = "catedescrip")
	private String descripcion;
	
	@JsonIgnore
	@OneToMany(mappedBy = "categoria")
	private List<Producto> listaProductos;
}

