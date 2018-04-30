package com.ias.springboot.backend.ias.models.services;

import java.util.List;

import com.ias.springboot.backend.ias.models.entity.Pais;

public interface IPaisService {
	public List<Pais> findAll();
}
