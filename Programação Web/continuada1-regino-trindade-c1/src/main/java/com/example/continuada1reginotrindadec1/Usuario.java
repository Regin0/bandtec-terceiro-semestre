package com.example.continuada1reginotrindadec1;

import java.time.LocalDateTime;

public class Usuario {

    private String usuario;
    private LocalDateTime autenticado;

    public Usuario(String usuario) {
        this.usuario = usuario;
        this.autenticado = LocalDateTime.now();
    }

    public String getUsuario() {
        return usuario;
    }

    public LocalDateTime getAutenticado() {
        return autenticado;
    }

}
