package com.example.continuada1reginotrindadec1;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/seguranca")
public class SegurancaController {

    private Auth auth = new Auth();

    @PostMapping("/entrar/{login}/{senha}")
    public String login(@PathVariable("login") String login,
                        @PathVariable("senha") String senha){
        return auth.validar(login,senha);
    }

    @GetMapping("/usuario")
    public Usuario getUsuarioLogado(){
        return auth.getUsuarioAtual();
    }

    @DeleteMapping("/usuario/logoff")
    public void deslogar() {
        auth.removerUsuarioAtual();
    }
}
