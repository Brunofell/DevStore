package com.example.DevStore.DTO.usuario;

import com.example.DevStore.entity.Usuario;

public record DadosListagemUsuario(
        Long id,
        String nome,
        String email,
        String senha,
        String telefone,
        String cpf,
        String cep
) {

    public DadosListagemUsuario(Usuario usuario){
        this(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getSenha(), usuario.getTelefone(), usuario.getCpf(), usuario.getCep());
    }
}
