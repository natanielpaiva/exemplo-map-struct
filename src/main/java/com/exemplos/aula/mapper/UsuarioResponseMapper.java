package com.exemplos.aula.mapper;

import com.exemplos.aula.controller.response.UsuarioResponse;
import com.exemplos.aula.entity.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", imports = ConverterMaiorIdade.class)
public interface UsuarioResponseMapper {


    @Mapping(source = "nome", target = "name")
    @Mapping(source = "sobreNome", target = "lastName")
    @Mapping(source = "idade", target = "age")
    @Mapping(expression = "java(ConverterMaiorIdade.converter(usuario.getMaiorIdade()))", target = "fullAge")
    UsuarioResponse usuarioToUsuarioResponse(Usuario usuario);

}
