package com.torres.antonio.santander.services.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.torres.antonio.santander.entities.Cliente;
import com.torres.antonio.santander.entities.Contrato;
import com.torres.antonio.santander.repositories.ClienteRepository;
import com.torres.antonio.santander.repositories.ContratoRepository;
import com.torres.antonio.santander.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{



    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ContratoRepository contratoRepository;

    @Override
    public Cliente save(Cliente cliente) {
        
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente findById(String id) {

        return clienteRepository.findByid(id);
    }

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }
    
    @Override
    public Contrato saveContrato(Contrato contrato) {
        
        return contratoRepository.save(contrato);
    }

    
}
