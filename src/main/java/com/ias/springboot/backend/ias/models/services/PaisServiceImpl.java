package com.ias.springboot.backend.ias.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ias.springboot.backend.ias.models.dao.IPaisDao;
import com.ias.springboot.backend.ias.models.entity.Pais;

@Service
public class PaisServiceImpl implements IPaisService {
	
	@Autowired
	private IPaisDao paisDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Pais> findAll() {
		// TODO Auto-generated method stub
		return (List<Pais>) paisDao.findAll();
	}	

}
