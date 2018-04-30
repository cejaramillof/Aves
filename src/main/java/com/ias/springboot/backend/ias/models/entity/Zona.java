package com.ias.springboot.backend.ias.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TONT_ZONAS")
public class Zona implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "CDZONA" , unique=true, columnDefinition="VARCHAR(3)", nullable = false)
    private String codigo;
	
	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}


	@Column(name = "DSNOMBRE", columnDefinition="VARCHAR(45)", nullable = false)
	private String nombre;
}