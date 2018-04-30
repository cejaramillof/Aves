package com.ias.springboot.backend.ias.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ias.springboot.backend.ias.models.entity.Ave;
import com.ias.springboot.backend.ias.models.services.IAveService;

@RestController
@RequestMapping("/api/aves")
public class AveRestController {
	@Autowired
	private IAveService aveService;	
	
	@GetMapping("")
	public List<Ave> index(){
		return aveService.findAll();
	}
	
	@GetMapping("/{cdAve}")	
	public Ave show(@PathVariable String cdAve) {
		return aveService.findById(cdAve);		
	}
	
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Ave create(@RequestBody Ave ave) {		
		return aveService.save(ave);
	}
	
	@PutMapping("/{cdAve}")
	@ResponseStatus(HttpStatus.CREATED)
	public Ave update(@RequestBody Ave ave, @PathVariable String cdAve) {
		Ave aveActual = aveService.findById(cdAve);
		
		aveActual.setNombreCientifico(ave.getNombreCientifico());
		aveActual.setNombreComun(ave.getNombreComun());
		
		return aveService.save(aveActual);
	}
	
	@DeleteMapping("/{cdAve}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String cdAve) {
		aveService.delete(cdAve);
	}
	
	@GetMapping("/buscar")	
	public List<Ave> findbyZonaAndNombre(@RequestParam(value = "nombre", required = false) String nombre, @RequestParam String zona) {
		if (nombre == null || nombre.isEmpty() ) return  aveService.findDistinctByPaisesZonaNombre(zona);
		
		return aveService.findDistinctByNombreComunLikeOrNombreCientificoLikeAndPaisesZonaNombre("%" + nombre + "%", "%" + nombre + "%", zona);		
	}	
	
}
