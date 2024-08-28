package com.example.DevStore.controller.pedido;

import com.example.DevStore.DTO.pedido.DadosCadastroPedido;
import com.example.DevStore.DTO.pedido.DadosListagemPedido;
import com.example.DevStore.DTO.pedido.DadosUpdatePedido;
import com.example.DevStore.entity.Pedido;
import com.example.DevStore.repository.PedidoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository repository;

    @PostMapping("cadastrar")
    public void cadastrar(@RequestBody DadosCadastroPedido dados){
        repository.save(new Pedido(dados));
        System.out.println(dados);
    }

    @GetMapping("listar")
    public List<DadosListagemPedido> listar(){
        return repository.findAll().stream().map(DadosListagemPedido::new).toList();
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }

    @PutMapping("atualizar")
    @Transactional
    public void atualizarPaciente(@RequestBody @Valid DadosUpdatePedido dados){

        var pedido = repository.getReferenceById(dados.id());

        pedido.atualizarInfos(dados);

        repository.save(pedido);
    }

}
