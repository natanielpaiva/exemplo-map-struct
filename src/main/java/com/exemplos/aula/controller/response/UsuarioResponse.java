package com.exemplos.aula.controller.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UsuarioResponse {

    private String name;

    private String lastName;

    private LocalDate dataNascimento;

    private Long age;

    private Boolean fullAge;

}