package com.torres.antonio.santander.facades;

import java.util.List;

import com.torres.antonio.santander.dto.requests.ClienteRequestDTO;
import com.torres.antonio.santander.dto.requests.ContratoRequestDTO;
import com.torres.antonio.santander.dto.responses.ClienteResponseDTO;
import com.torres.antonio.santander.dto.responses.ContratoResponseDTO;

public interface ClienteFacade {

    ClienteResponseDTO save(ClienteRequestDTO clienteRequestDTO);
    List<ClienteResponseDTO> findAll();
    ClienteResponseDTO findById(String id);
    ClienteResponseDTO update(ClienteRequestDTO clienteRequestDTO);
    ContratoResponseDTO saveContrato(ContratoRequestDTO contratoRequestDTO);
}
