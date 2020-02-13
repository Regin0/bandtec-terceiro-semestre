package br.com.bandtec.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/*
A anotação @RestController habilita a classe
a ter EndPoints configurados
 */
@RestController
public class HomeController {

    // a anotação @GetMapping transforma o método num EndPoint.
    // Neste caso, como não é indicada URI, será o EndPoint padrão
    @GetMapping
    public String inicio() {
        return "Minha primeira API REST ooowwnnn! Que fofo!";
    }

    // a anotação @GetMapping transforma o método num EndPoint.
    // Neste caso, a indicada URI será "/cumprimentar"
    @GetMapping("/cumprimentar")
    public String cumprimentar() {
        return "Boa noite, galera!";
    }

    // aqui configuramos um PATH PARAM.
    // seu nome aqui é "quem"
    @GetMapping("/beijar/{quem}") // ex: /beijar/GodZilla
    public String beijar(@PathVariable("quem") String quem) {
        return "Um beijo, "+quem+"!";
    }

    /*
    EndPoint que recebe 2 path params: nome e altura
    Ele retorna a String "Olá, NOME, você tem X de altura"
    OBS: A altura deve ser um Double
     */
    @GetMapping("/falar/{nome}/{altura}")
    public String falar(
            @PathVariable("nome") String nome,
            @PathVariable("altura") Double altura) {
        return "Olá, "+nome+", você tem "+altura+" de altura";
    }

    /*
    EndPoint que recebe 3 path params: nota 1, nota 2 e nome
    Ele retorna a frase
    "Oi, NOME, sua média foi X e seu resultado foi R"
    Onde R pode ser:
    Aprovado -> Caso a média for >= 5
    Reprovado -> Caso a média for < 5
     */
    @GetMapping("/avaliar/{nota1}/{nota2}/{nome}")
    public String avaliar(
            @PathVariable("nota1") Double nota1,
            @PathVariable("nota2") Double nota2,
            @PathVariable("nome") String nome
    ) {
        Double media = (nota1 + nota2) / 2;
        String resultado = media >=5 ? "Aprovado" : "Reprovado";

        return "Oi, "+nome+", sua média foi "
                +media+" e seu resultado foi "+resultado;
    }

}


