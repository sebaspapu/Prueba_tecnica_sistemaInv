package com.sebasPapu.sistemainv.persistence;

import java.util.List;
import java.util.Optional;

import com.sebasPapu.sistemainv.persistence.CRUD.VentaCrudRepository;
import com.sebasPapu.sistemainv.persistence.entity.Venta;

import org.springframework.beans.factory.annotation.Autowired;

public class VentaRepository {

    @Autowired
    VentaCrudRepository ventacCrudRepository;

    public List<Venta> obtenerVentas() {

        return (List<Venta>)ventacCrudRepository.findAll();
    }
}