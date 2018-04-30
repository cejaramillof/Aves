package com.ias.springboot.backend.ias.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TONT_PAISES")
public class Pais implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "CDPAIS" , unique=true, columnDefinition="VARCHAR(3)", nullable = false)
    private String codigo;
	
	@Column(name = "DSNOMBRE", columnDefinition="VARCHAR(100)", nullable = false)
	private String nombre;
	
	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public Zona getZona() {
		return zona;
	}

	@ManyToOne
	@JoinColumn(name = "CDZONA", nullable = false)
    private Zona zona;
	
}