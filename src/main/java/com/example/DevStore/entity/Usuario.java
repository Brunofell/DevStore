package com.example.DevStore.entity;

import com.example.DevStore.DTO.usuario.DadosCadastroUsuario;
import com.example.DevStore.DTO.usuario.DadosUpdateUsuario;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "usuario")
@Entity(name = "Usuario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(unique = true)
    private String email;
    private String senha;
    private String telefone;
    private String cpf;
    private String cep;
    private boolean ativo;

    public Usuario(DadosCadastroUsuario dados) {
        this.ativo = true;
        this.nome = dados.nome();
        this.email = dados.email();
        this.senha = dados.senha();
        this.telefone = dados.telefone();
        this.cpf = dados.cpf();
        this.cep = dados.cep();
    }

    public String getNome() {
        return nome;
    }
    public void excluir() {
        this.ativo = false;
    }

    public void atualizarInfos(DadosUpdateUsuario dados) {
        if(dados.nome() != null){
            this.nome = dados.nome();
        }
        if(dados.email() != null){
            this.email = dados.email();
        }
        if(dados.senha() != null){
            this.senha = dados.senha();
        }
        if(dados.telefone() != null){
            this.telefone = dados.telefone();
        }
        if(dados.cpf() != null){
            this.cpf = dados.cpf();
        }
        if(dados.cep() != null){
            this.cep = dados.cpf();
        }
    }
}
