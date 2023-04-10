package com.torres.antonio.santander.dto.responses;

import com.torres.antonio.santander.entities.Cartao;
import com.torres.antonio.santander.entities.Cliente;

import lombok.Data;

@Data
public class ContratoResponseDTO {
    
    private String id;
    private Cliente nomeClienteContrato;
    private Cartao tipoCartaoContratado;

}

