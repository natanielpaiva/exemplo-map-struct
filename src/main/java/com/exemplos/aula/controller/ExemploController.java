package com.exemplos.aula.controller;

import com.exemplos.aula.controller.request.UsuarioRequest;
import com.exemplos.aula.controller.response.UsuarioResponse;
import com.exemplos.aula.mapper.UsuarioRequestMapper;
import com.exemplos.aula.mapper.UsuarioResponseMapper;
import com.exemplos.aula.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExemploController {

    @Autowired
    UsuarioRequestMapper usuarioRequestMapper;

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    UsuarioResponseMapper usuarioResponseMapper;


    @PostMapping
    public UsuarioResponse cadastraUsuario(@RequestBody UsuarioRequest usuarioRequest){
        var usuario = usuarioRequestMapper.usuarioRequestToUsuario(usuarioRequest);
        var usuarioCadastro = usuarioRepository.cadastroUsuario(usuario);
        return usuarioResponseMapper.usuarioToUsuarioResponse(usuarioCadastro);
    }

}
