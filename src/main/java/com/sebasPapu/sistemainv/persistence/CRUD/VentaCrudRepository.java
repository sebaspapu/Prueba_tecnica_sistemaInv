package com.sebasPapu.sistemainv.persistence.CRUD;


import java.util.List;

import com.sebasPapu.sistemainv.persistence.entity.Venta;

import org.springframework.data.repository.CrudRepository;



public interface VentaCrudRepository extends CrudRepository<Venta,Integer>{

    public List<Venta> findByIdVendedor(Integer idVendedor);

        
}