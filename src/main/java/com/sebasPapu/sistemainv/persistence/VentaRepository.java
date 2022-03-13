package com.sebasPapu.sistemainv.persistence;

import java.util.List;
import java.util.Optional;

import com.sebasPapu.sistemainv.persistence.CRUD.VentaCrudRepository;
import com.sebasPapu.sistemainv.persistence.entity.Cliente;
import com.sebasPapu.sistemainv.persistence.entity.Venta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VentaRepository {

    @Autowired
    VentaCrudRepository ventacCrudRepository;

    public List<Venta> obtenerVentas() {

        return (List<Venta>)ventacCrudRepository.findAll();
    }

    public void eliminarVenta(Integer id){

        ventacCrudRepository.deleteById(id);
    }

    public Venta guardarVenta(Venta venta){

        return ventacCrudRepository.save(venta);
    }

    public Optional<Venta> buscarVenta(Integer id){

        return ventacCrudRepository.findById(id);
    }

    /*El retorno de este metodo es opcional, ya que no nos devolveria nada si 
    el metodo envia un valor nulo. 
    */
    public Optional<List<Venta>> obtenerVentasPorVendedor(Integer idVendedor) {

        return ventacCrudRepository.findByIdVendedor(idVendedor);
    }
    
    public Optional<List<Venta>> obtenerVentasPorCliente(Integer idCliente) {

        return ventacCrudRepository.findByIdCliente(idCliente);
    }

}