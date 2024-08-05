package com.example.DevStore.DTO.pedido;

import java.time.LocalDateTime;

public record DadosCadastroPedido(
        Long id,
        Long id_user,
        LocalDateTime data,
        Long total
) {
}
