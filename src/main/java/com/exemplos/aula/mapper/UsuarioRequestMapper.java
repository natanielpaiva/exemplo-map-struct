package com.exemplos.aula.mapper;

import com.exemplos.aula.controller.request.UsuarioRequest;
import com.exemplos.aula.entity.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UsuarioRequestMapper {


    @Mapping(source = "name", target = "nome")
    @Mapping(source = "lastName", target = "sobreNome")
    Usuario usuarioRequestToUsuario(UsuarioRequest usuarioRequest);

}

