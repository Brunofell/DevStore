package com.example.DevStore.DTO.produto;

public record DadosCadastroProduto(
        String nome,
        String descricao,
        String preco,
        Long estoque,
        String categoria
) {
}
