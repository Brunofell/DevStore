package com.example.DevStore.DTO.usuario;

import jakarta.persistence.Column;

public record DadosCadastroUsuario(
        String nome,
        String email,
        String senha,
        String telefone,
        String cpf,
        String cep,
        boolean ativo
) {
}
