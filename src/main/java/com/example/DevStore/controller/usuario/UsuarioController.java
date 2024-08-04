package com.example.DevStore.controller.usuario;

import com.example.DevStore.DTO.usuario.DadosCadastroUsuario;
import com.example.DevStore.DTO.usuario.DadosListagemUsuario;
import com.example.DevStore.DTO.usuario.DadosUpdateUsuario;
import com.example.DevStore.entity.Usuario;
import com.example.DevStore.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping("cadastrar")
    public void cadastrar(@RequestBody DadosCadastroUsuario dados){
        repository.save(new Usuario(dados));
        System.out.println(dados);
    }

    @GetMapping("listar")
    public List<DadosListagemUsuario> listar(){
        return repository.findAllByAtivoTrue().stream().map(DadosListagemUsuario::new).toList();
    }

    @DeleteMapping("/{id}")
    @Transactional // exclusão lógica
    public void excluir(@PathVariable Long id){
        var usuario = repository.getReferenceById(id);
        usuario.excluir();
    }

    @PutMapping("atualizar")
    @Transactional
    public void atualizarPaciente(@RequestBody @Valid DadosUpdateUsuario dados){

        var usuario = repository.getReferenceById(dados.id());

        usuario.atualizarInfos(dados);

        repository.save(usuario);
    }


}
