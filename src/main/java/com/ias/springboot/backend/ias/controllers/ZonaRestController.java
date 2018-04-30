package com.ias.springboot.backend.ias.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ias.springboot.backend.ias.models.entity.Zona;
import com.ias.springboot.backend.ias.models.services.IZonaService;
@RestController
@RequestMapping("/api/zonas")
public class ZonaRestController {
	@Autowired
	private IZonaService zonaService;
	
	@GetMapping("")
	public List<Zona> getAllZona(){
		return zonaService.findAll();
	}	
	
}
