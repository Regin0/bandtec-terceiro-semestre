package com.example.continuada1reginotrindadec1;

public class Auth {
    private Usuario usuarioAtual;

    public String validar(String login, String senha) {
        if (this.usuarioAtual != null) {
            return "Já existe usuário autenticado.";
        } else
        if (login.equals("Regino") && senha.equals("provinha")) {
            usuarioAtual = new Usuario(login);
            return "Usuário autenticado.";
        } else {
            return "Falha na autenticação.";
        }
    }

    public void removerUsuarioAtual() {
        this.usuarioAtual = null;
    }

    public Usuario getUsuarioAtual() {
        return usuarioAtual;
    }
}
