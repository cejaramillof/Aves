package com.ias.springboot.backend.ias.models.services;

import java.util.List;

import com.ias.springboot.backend.ias.models.entity.Ave;

public interface IAveService {
	public List<Ave> findAll();
	
	public Ave findById(String cdAve);
	
	public Ave save(Ave ave);
	
	public void delete(String cdAve);
	
	public List<Ave> findDistinctByPaisesZonaNombre(String Nombre); 
	
	public List<Ave> findDistinctByNombreComunLikeOrNombreCientificoLikeAndPaisesZonaNombre(String nombreCientifico, String nombreComun, String Nombre); 
}
