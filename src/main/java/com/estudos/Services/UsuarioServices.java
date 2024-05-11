package com.estudos.Services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudos.Modelos.UsuarioModelo;
import com.estudos.Repositorios.UsuarioRepositorio;

@Service
public class UsuarioServices {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    
    /**
     * Método para Buscar Todos Usuarios
     * @return Todos Usuarios
     */
    public List<UsuarioModelo> BuscarUsuario(){
        return usuarioRepositorio.findAll();
    }

    /**
     * Método para Buscar Usuario pelo Id
     * @param idUser
     * @return Retorna Usuario id
     */
    public UsuarioModelo BuscarPorId(UUID idUser){
        Optional<UsuarioModelo> obj = usuarioRepositorio.findById(idUser);
        return obj.get();
    }
}
