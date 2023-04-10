package com.torres.antonio.santander.dto.responses;

import lombok.Data;

@Data
public class CartaoResponseDTO {

    private String id;

    private String tipoCartao;

    private String limite;
    
    private String scoreCartao;

    
}
