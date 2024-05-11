package com.estudos.Dtos;

import jakarta.validation.constraints.NotBlank;


public record UsuarioDtos(@NotBlank String nome) {
} 
