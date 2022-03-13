package com.sebasPapu.sistemainv.services;

import java.util.List;

import com.sebasPapu.sistemainv.persistence.ClienteRepository;
import com.sebasPapu.sistemainv.persistence.entity.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ServicioDeCliente {
    
    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping("/todos")
    public List<Cliente> obtenerClientes(){
        return clienteRepository.obtenerClientes();
    }


}
