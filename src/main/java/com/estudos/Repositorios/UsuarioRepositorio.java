package com.estudos.Repositorios;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudos.Modelos.UsuarioModelo;

@Repository
public interface UsuarioRepositorio extends JpaRepository<UsuarioModelo, UUID>{
    
}
