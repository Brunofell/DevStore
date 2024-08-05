package com.example.DevStore.DTO.pedido;

import com.example.DevStore.entity.Pedido;

import java.time.LocalDateTime;

public record DadosListagemPedido (
    Long id_user,
    LocalDateTime data,
    Long total

) {
    public DadosListagemPedido(Pedido pedido){
        this(pedido.getId_user(), pedido.getData(), pedido.getTotal());
    }
}
