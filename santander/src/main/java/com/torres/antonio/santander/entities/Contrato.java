package com.torres.antonio.santander.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Contrato {


    private String id;
    private Cliente nomeClienteContrato;
    private Cartao tipoCartaoContratado;
    

}
