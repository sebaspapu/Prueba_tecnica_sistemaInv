package com.sebasPapu.sistemainv.persistence.CRUD;

import com.sebasPapu.sistemainv.persistence.entity.Producto;

import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto,Integer>{

    
}