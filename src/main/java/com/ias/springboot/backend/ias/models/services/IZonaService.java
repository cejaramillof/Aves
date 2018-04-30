package com.ias.springboot.backend.ias.models.services;

import java.util.List;

import com.ias.springboot.backend.ias.models.entity.Zona;

public interface IZonaService {
	public List<Zona> findAll();
}
