package com.Computec.Prueba.dao.api;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Computec.Prueba.model.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, Long>{

}
