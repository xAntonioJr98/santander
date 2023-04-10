package com.torres.antonio.santander.dto.requests;

import lombok.Data;

@Data
public class CartaoRequestDTO {

    private String id;

    private String tipoCartao;

    private String limite;
    
    private String scoreCartao;
}
