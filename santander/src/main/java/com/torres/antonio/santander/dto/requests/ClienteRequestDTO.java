package com.torres.antonio.santander.dto.requests;

import lombok.Data;

@Data
public class ClienteRequestDTO {


    private String id;

    private String nome;

    private String cpf;

    private Integer score;
}
