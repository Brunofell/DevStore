package com.example.DevStore.entity;

import com.example.DevStore.DTO.produto.DadosCadastroProduto;
import com.example.DevStore.DTO.produto.DadosUpdateProduto;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "produto")
@Entity(name = "Produto")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private String preco;
    private Long estoque;
    private String categoria;

    public Produto(DadosCadastroProduto dados) {
        this.nome = dados.nome();
        this.descricao = dados.descricao();
        this.preco = dados.preco();
        this.estoque = dados.estoque();
        this.categoria = dados.categoria();
    }

    public void atualizarInfos(DadosUpdateProduto dados) {
        if(dados.nome() != null){
            this.nome = dados.nome();
        }
        if(dados.categoria() != null){
            this.categoria = dados.categoria();
        }
        if(dados.descricao() != null){
            this.descricao = dados.descricao();
        }
        if(dados.preco() != null){
            this.preco = dados.preco();
        }
        if(dados.estoque() != null){
            this.estoque = dados.estoque();
        }
    }
}
