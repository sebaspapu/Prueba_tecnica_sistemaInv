package com.sebasPapu.sistemainv.services;

import java.util.List;
import java.util.Optional;

import com.sebasPapu.sistemainv.persistence.ClienteRepository;
import com.sebasPapu.sistemainv.persistence.entity.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ServicioDeCliente {
    
    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping("/obtenerClientes")
    public List<Cliente> obtenerClientes(){
        return clienteRepository.obtenerClientes();
    }

    @DeleteMapping("/eliminarCliente/{idCliente}")
    public boolean eliminarCliente(@PathVariable("idCliente") String id){
        return clienteRepository.buscarCliente(id).map(cliente->{
            clienteRepository.eliminarCliente(id);
            return true;
        }).orElse(false);
    }


    /*La manera de hacerlo utilizando el navegador para obtener
    los datos: */
    @GetMapping("/buscarCliente/{idCliente}")
    public Optional<Cliente> buscarCliente(@PathVariable("idCliente") String id)
    {
        return clienteRepository.buscarCliente(id);
    }
}
