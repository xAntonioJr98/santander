package com.torres.antonio.santander.utils;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperUtils {


    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
