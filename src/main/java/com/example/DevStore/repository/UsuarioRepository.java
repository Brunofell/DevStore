package com.example.DevStore.repository;

import com.example.DevStore.controller.usuario.UsuarioController;
import com.example.DevStore.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
