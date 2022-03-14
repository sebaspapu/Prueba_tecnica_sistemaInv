package com.sebasPapu.sistemainv.services;

import java.util.List;
import java.util.Optional;

import com.sebasPapu.sistemainv.persistence.VendedorRepository;
import com.sebasPapu.sistemainv.persistence.entity.Vendedor;
import com.sebasPapu.sistemainv.persistence.entity.Venta;

import org.springframework.beans.factory.annotation.Autowired;

public class ServicioDeVendedores {
    

    @Autowired
    VendedorRepository vendedorRepository;

    public Optional<List<Vendedor>> obtenerVendedores() {

        return vendedorRepository.obtenerVendedores();
    }

    public boolean eliminarVendedor(int id){
        return vendedorRepository.obtenerVendedorPorId(id).map(venta->{
            vendedorRepository.eliminarVendedor(id);
            return true;
        }).orElse(false);
    }

    public Optional<Vendedor> obtenerVendedorPorId(Integer id){
        return vendedorRepository.obtenerVendedorPorId(id);
    }
    
}
