package com.estudos.Controles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudos.Modelos.UsuarioModelo;
import com.estudos.Services.UsuarioServices;

@RestController
public class UsuariosControle {
    
    @Autowired
    private UsuarioServices usuarioServices;

    @GetMapping("/Usuarios")
    public ResponseEntity<List<UsuarioModelo>> BuscarTodosUser(){
        List<UsuarioModelo> listar = usuarioServices.BuscarUsuario();
        return ResponseEntity.status(HttpStatus.OK).body(listar);

    }
}
