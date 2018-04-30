package com.ias.springboot.backend.ias.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ias.springboot.backend.ias.models.dao.IAveDao;
import com.ias.springboot.backend.ias.models.entity.Ave;

@Service
public class AveServiceImpl implements IAveService{

	@Autowired
	private IAveDao aveDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Ave> findAll() {
		// TODO Auto-generated method stub
		return (List<Ave>) aveDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Ave findById(String cdAve) {
		// TODO Auto-generated method stub
		return aveDao.findById(cdAve).orElse(null);
	}

	@Override
	@Transactional
	public Ave save(Ave ave) {
		// TODO Auto-generated method stub
		return aveDao.save(ave);
	}

	@Override
	@Transactional
	public void delete(String cdAve) {
		// TODO Auto-generated method stub
		aveDao.deleteById(cdAve);
	}

	@Override
	public List<Ave> findDistinctByPaisesZonaNombre(String Nombre) {
		// TODO Auto-generated method stub
		return (List<Ave>) aveDao.findDistinctByPaisesZonaNombre(Nombre);
	}

	@Override
	public List<Ave> findDistinctByNombreComunLikeOrNombreCientificoLikeAndPaisesZonaNombre(String nombreCientifico, String nombreComun, String Nombre) {
		// TODO Auto-generated method stub
		return (List<Ave>) aveDao.findDistinctByNombreComunLikeOrNombreCientificoLikeAndPaisesZonaNombre(nombreCientifico, nombreComun, Nombre);
	}

}
