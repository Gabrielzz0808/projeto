package com.estudos.Modelos;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.hateoas.RepresentationModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Usuario")
public class UsuarioModelo extends RepresentationModel<UsuarioModelo> implements Serializable {

    public static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_usuario;
    private String nome;
    private String email;
    private String tel;
    private String senha;
    
    
    
    public UsuarioModelo(UUID id_usuario, String nome, String email, String tel, String senha) {
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.email = email;
        this.tel = tel;
        this.senha = senha;
    }
    
    public UUID getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(UUID id_usuario) {
        this.id_usuario = id_usuario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((id_usuario == null) ? 0 : id_usuario.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        UsuarioModelo other = (UsuarioModelo) obj;
        if (id_usuario == null) {
            if (other.id_usuario != null)
                return false;
        } else if (!id_usuario.equals(other.id_usuario))
            return false;
        return true;
    }
    
}
