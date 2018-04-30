package com.ias.springboot.backend.ias.models.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TONT_AVES")
public class Ave implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "CDAVE", unique=true, columnDefinition="VARCHAR(5)", nullable = false)
	private String cdAve;
	
	@Column(name = "DSNOMBRE_COMUN", columnDefinition="VARCHAR(100)", nullable = false)
	private String nombreComun;
	
	public String getCdAve() {
		return cdAve;
	}

	public void setCdAve(String cdAve) {
		this.cdAve = cdAve;
	}

	public String getNombreComun() {
		return nombreComun;
	}

	public void setNombreComun(String nombreComun) {
		this.nombreComun = nombreComun;
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	public Set<Pais> getPaises() {
		return paises;
	}

	public void setPaises(Set<Pais> paises) {
		this.paises = paises;
	}

	@Column(name = "DSNOMBRE_CIENTIFICO", columnDefinition="VARCHAR(200)", nullable = false)
	private String nombreCientifico;	
	
	@ManyToMany
    @JoinTable(name = "TONT_AVES_PAIS",
               joinColumns = @JoinColumn(name="CDAVE", referencedColumnName="CDAVE"),
               inverseJoinColumns = @JoinColumn(name="CDPAIS", referencedColumnName="CDPAIS"))
	private Set<Pais> paises = new HashSet<>();
	
}