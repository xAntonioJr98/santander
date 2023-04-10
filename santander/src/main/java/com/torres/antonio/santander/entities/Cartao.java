package com.torres.antonio.santander.entities;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Document
@Data
public class Cartao implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String id;

    private String tipoCartao;

    private String limite;
    
    private String scoreCartao;


}

