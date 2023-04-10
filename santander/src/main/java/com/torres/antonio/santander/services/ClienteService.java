package com.torres.antonio.santander.services;

import java.util.List;

import com.torres.antonio.santander.entities.Cliente;
import com.torres.antonio.santander.entities.Contrato;

public interface ClienteService {
    
    Cliente save (Cliente cliente);
    Cliente findById(String id);
    List<Cliente> findAll();
    Contrato saveContrato (Contrato contrato);
}
