package com.ias.springboot.backend.ias.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ias.springboot.backend.ias.models.entity.Pais;
import com.ias.springboot.backend.ias.models.services.IPaisService;

@RestController
@RequestMapping("/api/paises")
public class PaisRestController {
	@Autowired
	private IPaisService paisService;	
	
	@GetMapping("")
	public List<Pais> getAllPaises(){
		return paisService.findAll();
	}	
}
