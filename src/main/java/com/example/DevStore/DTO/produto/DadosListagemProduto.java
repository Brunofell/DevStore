package com.example.DevStore.DTO.produto;

import com.example.DevStore.entity.Produto;

public record DadosListagemProduto(
        String nome,
        String descricao,
        String preco,
        Long estoque,
        String categoria
) {
    public DadosListagemProduto (Produto produto){
        this(produto.getNome(), produto.getDescricao(), produto.getPreco(), produto.getEstoque(), produto.getCategoria());
    }
}
