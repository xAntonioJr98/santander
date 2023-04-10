package com.torres.antonio.santander.facades;

import java.util.List;

import com.torres.antonio.santander.dto.requests.CartaoRequestDTO;
import com.torres.antonio.santander.dto.responses.CartaoResponseDTO;

public interface CartaoFacade {
    CartaoResponseDTO save(CartaoRequestDTO cartaoRequestDTO);
    CartaoResponseDTO findById(String id);
    List<CartaoResponseDTO> findAll();
    CartaoResponseDTO update(CartaoRequestDTO cartaoRequestDTO);
}
