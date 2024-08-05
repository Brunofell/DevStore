package com.example.DevStore.DTO.pedido;

import java.time.LocalDateTime;

public record DadosUpdatePedido (
        Long id,
        Long id_user,
        LocalDateTime data,
        Long total
){

}
