package com.sebasPapu.sistemainv.persistence;

import java.util.List;
import java.util.Optional;

import com.sebasPapu.sistemainv.persistence.CRUD.ProductoCrudRepository;
import com.sebasPapu.sistemainv.persistence.entity.Producto;

public class ProductoRepository {

    ProductoCrudRepository productoCrudRepository;

    public List<Producto> obtenerProductos(){
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public Optional<Producto> obtenerProducto(Integer id){
        return productoCrudRepository.findById(id);
    }

    public  Optional<List<Producto>> obtenerProductosPorStock(Integer cantidad){
        return productoCrudRepository.findByCantidadStockLessThan(cantidad);
    }

    public  Optional<List<Producto>> buscarProductosPorNombre(String nombre){
        return productoCrudRepository.findByNombreContainingOrderByNombreAsc(nombre);
    }
}