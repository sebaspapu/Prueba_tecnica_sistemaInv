package com.sebasPapu.sistemainv.persistence.CRUD;


import com.sebasPapu.sistemainv.persistence.entity.Cliente;

import org.springframework.data.repository.CrudRepository;

public interface ClienteCrudRepository extends CrudRepository<Cliente,Integer>{

    
}