package com.example.DevStore.DTO.produto;

public record DadosUpdateProduto(
        Long id,
        String nome,
        String descricao,
        String preco,
        Long estoque,
        String categoria
) {
}
