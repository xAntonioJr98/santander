package com.torres.antonio.santander.entities;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Cliente implements Serializable {


    @Id
    private String id;

    private String nome;

    private String cpf;

    private Integer score;

    
    
}
