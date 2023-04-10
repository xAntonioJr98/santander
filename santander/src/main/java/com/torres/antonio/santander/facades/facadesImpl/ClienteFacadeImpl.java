package com.torres.antonio.santander.facades.facadesImpl;


import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.torres.antonio.santander.dto.requests.ClienteRequestDTO;
import com.torres.antonio.santander.dto.requests.ContratoRequestDTO;
import com.torres.antonio.santander.dto.responses.ClienteResponseDTO;
import com.torres.antonio.santander.dto.responses.ContratoResponseDTO;
import com.torres.antonio.santander.entities.Cliente;
import com.torres.antonio.santander.entities.Contrato;
import com.torres.antonio.santander.facades.ClienteFacade;
import com.torres.antonio.santander.services.ClienteService;



@Component
public class ClienteFacadeImpl implements ClienteFacade {


    @Autowired
    private ClienteService clienteService;


    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ClienteResponseDTO save(ClienteRequestDTO clienteRequestDTO) {
        
        return convertToDTO(clienteService.save(convertToEntity(clienteRequestDTO)));
    }

    @Override
    public ClienteResponseDTO findById(String id) {
        return convertToDTO(clienteService.findById(id));
    }
    @Override
    public List<ClienteResponseDTO> findAll() {

        List<ClienteResponseDTO> clientesList = new ArrayList<>();

        for (Cliente cliente : clienteService.findAll()) {
            clientesList.add(convertToDTO(cliente));
        }

        return clientesList;
    }

    @Override
    public ClienteResponseDTO update(ClienteRequestDTO clienteRequestDTO) {
        return convertToDTO(clienteService.save(convertToEntity(clienteRequestDTO)));
    }

    @Override
    public ContratoResponseDTO saveContrato(ContratoRequestDTO contratoRequestDTO) {
        if (contratoRequestDTO.getNomeClienteContrato().getScore() < 299) {
            throw new IllegalArgumentException("Score muito baixo para este cartão");
        }
        if (contratoRequestDTO.getNomeClienteContrato().getScore() < 499) {
            throw new IllegalArgumentException("Score muito baixo para este cartão");
        }
        if (contratoRequestDTO.getNomeClienteContrato().getScore() < 799) {
            throw new IllegalArgumentException("Score muito baixo para este cartão");
        }
        return convertToDTO(clienteService.saveContrato(convertToEntity(contratoRequestDTO)));
    }


    private Cliente convertToEntity(ClienteRequestDTO clienteRequestDTO){

        return modelMapper.map(clienteRequestDTO, Cliente.class);


    }

    private ClienteResponseDTO convertToDTO(Cliente cliente){

        return modelMapper.map(cliente, ClienteResponseDTO.class);

    }

    private Contrato convertToEntity(ContratoRequestDTO contratoRequestDTO){

        return modelMapper.map(contratoRequestDTO, Contrato.class);


    }

    private ContratoResponseDTO convertToDTO(Contrato contrato){

        return modelMapper.map(contrato, ContratoResponseDTO.class);
        

    }

    

   

    

    

}
