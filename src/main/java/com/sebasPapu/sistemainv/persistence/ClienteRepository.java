package com.sebasPapu.sistemainv.persistence;


import com.sebasPapu.sistemainv.persistence.CRUD.ClienteCrudRepository;
import com.sebasPapu.sistemainv.persistence.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ClienteRepository {
    //Necesitamos editar cliente

    @Autowired
    ClienteCrudRepository clienteCrudRepository;

    public List<Cliente> obtenerClientes() {
        return (List<Cliente>) clienteCrudRepository.findAll();
    }

    public void eliminarCliente(int id) {
        clienteCrudRepository.deleteById(id);
    }

    public Optional<Cliente> buscarCliente(int id) {
        return clienteCrudRepository.findById(id);
    }

    public Cliente guardarCliente(Cliente cliente){
        return clienteCrudRepository.save(cliente);
    }
}