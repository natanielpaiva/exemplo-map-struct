package com.exemplos.aula.entity;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;

@Getter
@Setter
public class Usuario {

    private Long id;

    private String nome;

    private String sobreNome;

    private LocalDate dataNascimento;

    private Integer idade;

    public Integer getIdade(){
        var hoje = LocalDate.now();
        return Period.between(dataNascimento, hoje).getYears();
    }

    public String getMaiorIdade(){
        var maiorIdade = "Não";
        if(getIdade() > 17){
            maiorIdade = "Sim";
        }
        return maiorIdade;
    }
}
