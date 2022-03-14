package com.sebasPapu.sistemainv.services;

import java.util.List;
import java.util.Optional;

import com.sebasPapu.sistemainv.persistence.VendedorRepository;
import com.sebasPapu.sistemainv.persistence.entity.Vendedor;
import com.sebasPapu.sistemainv.persistence.entity.Venta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendedores")
public class ServicioDeVendedores {

    @Autowired
    VendedorRepository vendedorRepository;

    @GetMapping("/")
    public Optional<List<Vendedor>> obtenerVendedores() {
        return vendedorRepository.obtenerVendedores();
    }

    @DeleteMapping("vendedor/{idVendedor}")
    public boolean eliminarVendedor(@PathVariable("idVendedor") int id){
        return vendedorRepository.obtenerVendedorPorId(id).map(venta->{
            vendedorRepository.eliminarVendedor(id);
            return true;
        }).orElse(false);
    }

    @GetMapping("vendedor/{idVendedor}")
    public Vendedor obtenerVendedorPorId(@PathVariable("idVendedor") Integer id){;
        return vendedorRepository.obtenerVendedorPorId(id).map(vendedor -> vendedor).orElse(null);
    }
    
}
