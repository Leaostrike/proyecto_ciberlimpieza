package com.serviciorest.server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_produc")
@Getter
@Setter
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idproduc")
	private int idProducto;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="producdescrip")
	private String descripcionProd;
	
	private String foto;
	private double precio;
	private int stock;
	private String estado;
	
	@ManyToOne
	@JoinColumn(name="idcate")
	private Categoria categoria;
	

	

}


 