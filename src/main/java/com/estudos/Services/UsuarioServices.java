package com.estudos.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudos.Modelos.UsuarioModelo;
import com.estudos.Repositorios.UsuarioRepositorio;

@Service
public class UsuarioServices {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    
    /**
     * Método para Buscar um Usuario
     * @return Todos Usuarios
     */
    public List<UsuarioModelo> BuscarUsuario(){
        return usuarioRepositorio.findAll();
    }
}
