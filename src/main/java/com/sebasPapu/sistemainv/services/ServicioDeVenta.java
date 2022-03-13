package com.sebasPapu.sistemainv.services;

import java.util.List;

import com.sebasPapu.sistemainv.persistence.VentaRepository;
import com.sebasPapu.sistemainv.persistence.entity.Venta;

import org.springframework.beans.factory.annotation.Autowired;

public class ServicioDeVenta {
    
    @Autowired
    VentaRepository ventaRepository;
      
    public List<Venta> obtenerVentas() {

        return ventaRepository.obtenerVentas();
    }

    public boolean eliminarVenta(int id){
        return ventaRepository.buscarVenta(id).map(venta->{
            ventaRepository.eliminarVenta(id);
            return true;
        }).orElse(false);
    }

    public Venta guardarVenta(Venta venta){

        Double total;
        return ventaRepository.guardarVenta(venta);
    }

}
