package com.exemplos.aula.repository;

import com.exemplos.aula.entity.Usuario;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UsuarioRepository {

    public static List<Usuario> LISTA_USUARIOS = new ArrayList<>();

    public Usuario cadastroUsuario(Usuario usuario){
        LISTA_USUARIOS.add(usuario);
        return usuario;
    }

}
