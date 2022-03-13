package com.sebasPapu.sistemainv.persistence;

import java.util.List;
import java.util.Optional;

import com.sebasPapu.sistemainv.persistence.CRUD.VendedorCrudRepository;
import com.sebasPapu.sistemainv.persistence.entity.Vendedor;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class VendedorRepository {
    
    @Autowired
    VendedorCrudRepository vendedorCrudRepository;

    public Optional<List<Vendedor>> obtenerVendedores() {
        return Optional.of((List<Vendedor>) vendedorCrudRepository.findAll());
    }

    public Optional<Vendedor> obtenerVendedorPorId(Integer id){
        return vendedorCrudRepository.findById(id);
    }

    public void eliminarVendedor(Integer id){

        vendedorCrudRepository.deleteById(id);
    }

    public Vendedor guardarVendedor(Vendedor vendedor){

        return vendedorCrudRepository.save(vendedor);
    }
        

}
