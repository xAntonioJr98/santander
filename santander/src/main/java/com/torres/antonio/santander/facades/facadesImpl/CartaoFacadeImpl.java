package com.torres.antonio.santander.facades.facadesImpl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.torres.antonio.santander.dto.requests.CartaoRequestDTO;
import com.torres.antonio.santander.dto.responses.CartaoResponseDTO;
import com.torres.antonio.santander.entities.Cartao;
import com.torres.antonio.santander.facades.CartaoFacade;
import com.torres.antonio.santander.services.CartaoService;

@Component
public class CartaoFacadeImpl implements CartaoFacade {

    @Autowired
    private CartaoService cartaoService;


    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CartaoResponseDTO save(CartaoRequestDTO cartaoRequestDTO) {
        
        return convertToDTO(cartaoService.save(convertToEntity(cartaoRequestDTO)));
    }

    @Override
    public CartaoResponseDTO findById(String id) {
        return convertToDTO(cartaoService.findById(id));
    }

    @Override
    public List<CartaoResponseDTO> findAll() {
        List<CartaoResponseDTO> cartaoList = new ArrayList<>();

        for (Cartao cartao : cartaoService.findAll()) {
            cartaoList.add(convertToDTO(cartao));
        }

        return cartaoList;
    }

    @Override
    public CartaoResponseDTO update(CartaoRequestDTO cartaoRequestDTO) {
        return convertToDTO(cartaoService.save(convertToEntity(cartaoRequestDTO)));
    }



    private Cartao convertToEntity(CartaoRequestDTO cartaoRequestDTO){

        return modelMapper.map(cartaoRequestDTO, Cartao.class);


    }

    private CartaoResponseDTO convertToDTO(Cartao cartao){

        return modelMapper.map(cartao, CartaoResponseDTO.class);

    }

    

    
}
