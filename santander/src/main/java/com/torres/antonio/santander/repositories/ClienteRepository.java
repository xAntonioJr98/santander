package com.torres.antonio.santander.repositories;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.torres.antonio.santander.entities.Cliente;


@Repository
public interface ClienteRepository extends MongoRepository <Cliente, String> {
    
    Cliente findByid(String id);
}


