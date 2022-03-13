package com.sebasPapu.sistemainv.persistence.CRUD;


import java.util.List;
import java.util.Optional;

import javax.swing.text.html.Option;

import com.sebasPapu.sistemainv.persistence.entity.Cliente;
import com.sebasPapu.sistemainv.persistence.entity.Venta;

import org.springframework.data.repository.CrudRepository;



public interface VentaCrudRepository extends CrudRepository<Venta,Integer>{

    public Optional<List<Venta>> findByIdVendedor(Integer idVendedor);

    public Optional<List<Venta>> findByIdCliente (Integer idCliente);   
}