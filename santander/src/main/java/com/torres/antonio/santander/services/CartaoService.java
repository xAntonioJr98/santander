package com.torres.antonio.santander.services;

import java.util.List;

import com.torres.antonio.santander.entities.Cartao;

public interface CartaoService {
    Cartao save (Cartao cartao);
    Cartao findById(String id);
    List<Cartao> findAll();
}
