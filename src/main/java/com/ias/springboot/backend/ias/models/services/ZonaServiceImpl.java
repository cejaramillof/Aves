package com.ias.springboot.backend.ias.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ias.springboot.backend.ias.models.dao.IZonaDao;
import com.ias.springboot.backend.ias.models.entity.Zona;

@Service
public class ZonaServiceImpl implements IZonaService  {
	
	@Autowired
	private IZonaDao zonaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Zona> findAll() {
		// TODO Auto-generated method stub
		return (List<Zona>) zonaDao.findAll();
	}
}
