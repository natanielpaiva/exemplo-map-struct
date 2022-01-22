package com.exemplos.aula.controller.request;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UsuarioRequest {

    private String name;

    private String lastName;

    private LocalDate dataNascimento;

}

