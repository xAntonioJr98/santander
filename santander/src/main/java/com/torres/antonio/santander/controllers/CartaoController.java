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

import com.torres.antonio.santander.dto.requests.CartaoRequestDTO;
import com.torres.antonio.santander.dto.responses.CartaoResponseDTO;
import com.torres.antonio.santander.facades.CartaoFacade;


@RestController
@RequestMapping("/api/v1/cartoes")
public class CartaoController {
    

    @Autowired
    private CartaoFacade cartaoFacade;


    @PostMapping("/adicionar")
    public ResponseEntity<CartaoResponseDTO> create(@RequestBody CartaoRequestDTO cartaoRequestDTO){
        
        return new ResponseEntity<>(cartaoFacade.save(cartaoRequestDTO),HttpStatus.CREATED);

    }
    
    @GetMapping("/{id}")
    public ResponseEntity<CartaoResponseDTO> getById(@PathVariable String id){
        
        return new ResponseEntity<>(cartaoFacade.findById(id), HttpStatus.OK);

    }

    @GetMapping
    public ResponseEntity<List<CartaoResponseDTO>> findAll(){
        
        return new ResponseEntity<>(cartaoFacade.findAll(), HttpStatus.OK);

    }
    
    @PutMapping("/atualizar")
    public ResponseEntity<CartaoResponseDTO> update(@RequestBody CartaoRequestDTO cartaoRequestDTO){
        
        return new ResponseEntity<>(cartaoFacade.update(cartaoRequestDTO),HttpStatus.OK);

    }


}
