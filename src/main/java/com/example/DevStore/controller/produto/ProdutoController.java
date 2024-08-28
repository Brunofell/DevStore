package com.example.DevStore.controller.produto;

import com.example.DevStore.DTO.produto.DadosCadastroProduto;
import com.example.DevStore.DTO.produto.DadosListagemProduto;
import com.example.DevStore.DTO.produto.DadosUpdateProduto;
import com.example.DevStore.entity.Produto;
import com.example.DevStore.repository.ProdutoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @PostMapping("cadastrar")
    public void cadastrar(@RequestBody DadosCadastroProduto dados){
        repository.save(new Produto(dados));
        System.out.println(dados);
    }

    @GetMapping("listar")
    public List<DadosListagemProduto> listar(){
        return repository.findAll().stream().map(DadosListagemProduto::new).toList();
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }

    @PutMapping("atualizar")
    @Transactional
    public void atualizarProduto(@RequestBody @Valid DadosUpdateProduto dados){

        var Produto = repository.getReferenceById(dados.id());

        Produto.atualizarInfos(dados);

        repository.save(Produto);
    }


}
