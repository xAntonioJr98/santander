package com.torres.antonio.santander.repositories;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.torres.antonio.santander.entities.Cartao;



@Repository
public interface CartaoRepository extends MongoRepository <Cartao, String> {

    Cartao findByid(String id);

}
