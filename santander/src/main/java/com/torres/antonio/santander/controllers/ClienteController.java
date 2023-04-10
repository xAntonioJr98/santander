package com.torres.antonio.santander.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.torres.antonio.santander.dto.requests.ClienteRequestDTO;
import com.torres.antonio.santander.dto.requests.ContratoRequestDTO;
import com.torres.antonio.santander.dto.responses.ClienteResponseDTO;
import com.torres.antonio.santander.dto.responses.ContratoResponseDTO;
import com.torres.antonio.santander.facades.ClienteFacade;





@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {


    @Autowired
    private ClienteFacade clienteFacade;



    @PostMapping("/adicionar")
    public ResponseEntity<ClienteResponseDTO> create(@RequestBody ClienteRequestDTO clienteRequestDTO){
        
        return new ResponseEntity<>(clienteFacade.save(clienteRequestDTO),HttpStatus.CREATED);

    }
    
    @GetMapping("/{id}")
    public ResponseEntity<ClienteResponseDTO> getById(@PathVariable String id){
        
        return new ResponseEntity<>(clienteFacade.findById(id), HttpStatus.OK);

    }
    @GetMapping
    public ResponseEntity<List<ClienteResponseDTO>> findAll(){
        
        return new ResponseEntity<>(clienteFacade.findAll(), HttpStatus.OK);

    }
    
    @PutMapping("/atualizar")
    public ResponseEntity<ClienteResponseDTO> update(@RequestBody ClienteRequestDTO clienteRequestDTO){
        
        return new ResponseEntity<>(clienteFacade.update(clienteRequestDTO),HttpStatus.OK);

    }
    @PostMapping("/contrato")
    public ResponseEntity<ContratoResponseDTO> create(@RequestBody ContratoRequestDTO contratoRequestDTO){
        
        return new ResponseEntity<>(clienteFacade.saveContrato(contratoRequestDTO),HttpStatus.CREATED);

    }

}
