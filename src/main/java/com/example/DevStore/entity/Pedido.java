package com.example.DevStore.entity;

import com.example.DevStore.DTO.pedido.DadosCadastroPedido;
import com.example.DevStore.DTO.pedido.DadosUpdatePedido;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Table(name = "pedido")
@Entity(name = "Pedido")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long id_user;
    private LocalDateTime data;
    private Long total;

    public Pedido(DadosCadastroPedido dados) {
        this.id_user = dados.id_user();
        this.data = dados.data();
        this.total = dados.total();
    }

    public void atualizarInfos(DadosUpdatePedido dados) {
        if(dados.id_user() != null){
            this.id_user = dados.id_user();
        }
        if(dados.data() != null){
            this.data= dados.data();
        }
        if(dados.total() != null){
            this.total = dados.total();
        }
    }
}
