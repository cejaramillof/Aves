package com.ias.springboot.backend.ias.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ias.springboot.backend.ias.models.entity.Ave;

public interface IAveDao extends CrudRepository<Ave, String>{

	public List<Ave> findDistinctByPaisesZonaNombre(String Nombre);
	
	public List<Ave> findDistinctByNombreComunLikeOrNombreCientificoLikeAndPaisesZonaNombre(String nombreCientifico, String nombreComun, String Nombre);


}
