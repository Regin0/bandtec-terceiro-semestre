package br.com.bandtec.projeto02;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sala")
public class SalaController {

    private Sala salaAtual;

    @GetMapping
    public Sala getSalaAtual() {
        return salaAtual;
    }

    @PostMapping("/cadastrar/{nome}/{capacidade}")
    public void cadastrarSala(
        @PathVariable("nome") String nome,
        @PathVariable("capacidade") Integer capacidade
    ) {
        if (salaAtual == null) {
            salaAtual = new Sala(nome, capacidade);
        }
    }

    // Poderia fazer assim também
//    @RequestMapping(
//            value = "/excluir",
//            method = RequestMethod.DELETE)
    @DeleteMapping("/excluir")
    public void excluirSala() {
        salaAtual = null;
    }

    @PutMapping("/cadastrar/{nome}/{capacidade}")
    public void atualizarSala(
        @PathVariable("nome") String nome,
        @PathVariable("capacidade") Integer capacidade)
    {
       // if (salaAtual != null) {
           // salaAtual = new Sala(nome, capacidade);
        //}

        salaAtual.setNome(nome);
        salaAtual.setCapacidade(capacidade);
    }

}
