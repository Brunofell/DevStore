package com.example.DevStore.DTO.usuario;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;

public record DadosUpdateUsuario(
        Long id,
        String nome,
        String email,
        String senha,
        String telefone,
        String cpf,
        String cep
) {
}
