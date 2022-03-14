package com.sebasPapu.sistemainv.services;

import java.util.List;
import java.util.Optional;

import com.sebasPapu.sistemainv.persistence.VentaRepository;
import com.sebasPapu.sistemainv.persistence.entity.Venta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ventas")
public class ServicioDeVenta {
    
    @Autowired
    VentaRepository ventaRepository;

    @GetMapping("")
    public List<Venta> obtenerVentas() {
        return ventaRepository.obtenerVentas();
    }

    @DeleteMapping("venta/{id}")
    public boolean eliminarVenta(@PathVariable("id") int id){
        return ventaRepository.buscarVenta(id).map(venta->{
            ventaRepository.eliminarVenta(id);
            return true;
        }).orElse(false);
    }
    @GetMapping("venta/{id}")
    public Venta buscarVenta (@PathVariable("id") Integer id){
        return ventaRepository.buscarVenta(id).map(venta -> venta).orElse(null);
    }

    @GetMapping("venta/vendedor/{idVendedor}")
    public List<Venta> obtenerVentasPorVendedor(@PathVariable("idVendedor") Integer idVendedor){
        return ventaRepository.obtenerVentasPorVendedor(idVendedor).map(ventas -> ventas).orElse(null);
    }

    @GetMapping("venta/cliente/{idCliente}")
    public Optional<List<Venta>> obtenerVentasPorCliente(@PathVariable("idCliente") Integer idCliente){
        return ventaRepository.obtenerVentasPorCliente(idCliente);
    }

    /*
    public Venta guardarVenta(Venta venta){

        Double total;
        return ventaRepository.guardarVenta(venta);
    }*/

}