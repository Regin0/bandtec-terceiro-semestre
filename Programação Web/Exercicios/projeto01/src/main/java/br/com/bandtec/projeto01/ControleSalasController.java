package br.com.bandtec.projeto02;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/controle-salas")
public class ControleSalasController {

    private List<Sala> salas = new ArrayList<>();

    @PostMapping("/criar/{nome}/{capacidade}")
    public void criarSala(
        @PathVariable("nome") String nome,
        @PathVariable("capacidade") Integer capacidade
    ) {
        salas.add(new Sala(nome, capacidade));
    }

    @GetMapping
    public List<Sala> getSalas() {
        return salas;
    }
}
