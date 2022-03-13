package com.sebasPapu.sistemainv.persistence.CRUD;

import java.util.List;
import java.util.Optional;

import com.sebasPapu.sistemainv.persistence.entity.Producto;

import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto,Integer>{

    Optional<List<Producto>> findByStockLessThan(int cantidad);
    Optional<List<Producto>> findByNombreContainingOrderByNombreAsc(String nombre);

}