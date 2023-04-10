package com.torres.antonio.santander.services.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.torres.antonio.santander.entities.Cartao;
import com.torres.antonio.santander.repositories.CartaoRepository;
import com.torres.antonio.santander.services.CartaoService;

@Service
public class CartaoServiceImpl implements CartaoService {
    

    @Autowired
    private CartaoRepository cartaoRepository;

    @Override
    public Cartao save(Cartao cartao) {
        
        return cartaoRepository.save(cartao);
    }

    @Override
    public Cartao findById(String id) {

        return cartaoRepository.findByid(id);
    }

    @Override
    public List<Cartao> findAll() {
        return cartaoRepository.findAll();
    }


}
