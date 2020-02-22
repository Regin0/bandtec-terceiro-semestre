package br.com.bandtec.projeto02;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/controle-salas")
public class ControleSalasController {

    private ArrayList<Sala> adicionarSala = new ArrayList<Sala>();

    @PostMapping("/criar/{nome}/{capacidade}")
    public void tantoFaz (
    @PathVariable("nome") String nome,
    @PathVariable("capacidade") Integer capacidade
    ){

        adicionarSala.add(new Sala(nome, capacidade));
    }

    @GetMapping("/")
    public ArrayList<Sala> devolveSalas(){
        return adicionarSala;
    }
}
