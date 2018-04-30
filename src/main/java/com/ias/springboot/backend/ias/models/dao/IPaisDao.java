package com.ias.springboot.backend.ias.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ias.springboot.backend.ias.models.entity.Pais;

public interface IPaisDao extends CrudRepository<Pais, String>{

}
