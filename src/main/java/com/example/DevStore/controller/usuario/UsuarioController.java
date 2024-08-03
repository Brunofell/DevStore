package com.example.DevStore.controller.usuario;

import com.example.DevStore.DTO.usuario.DadosCadastroUsuario;
import com.example.DevStore.entity.Usuario;
import com.example.DevStore.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping("cadastrar")
    public void cadastrar(@RequestBody DadosCadastroUsuario dados){
        repository.save(new Usuario(dados));
        System.out.println(dados);
    }
}
