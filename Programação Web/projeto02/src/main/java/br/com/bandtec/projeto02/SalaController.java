package br.com.bandtec.projeto02;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sala")
public class SalaController {

    private Sala salAtual;

    @GetMapping()
    public Sala getSalAtual() {
        return salAtual;
    }

    @PostMapping("/cadastrar/{nome}/{capacidade}")
    public void cadastrarSala(
        @PathVariable("nome")String nome,
    @PathVariable("capacidade") Integer capacidade
        ){
        if (salAtual == null){
            salAtual = new Sala(nome, capacidade);
        }
    }

//    @RequestMapping(value = "/excluir"
//    ,method = RequestMethod.DELETE)

    @DeleteMapping("/excluir")
    public void excluirSala(){
        salAtual = null;
    }

    @PutMapping("/cadastrar/{nome}/{capacidade}")
    public void atualizarSala(
        @PathVariable("nome") String nome,
        @PathVariable("capacidade") Integer capacidade) {
            if (salAtual != null) {
                salAtual = new Sala(nome, capacidade);
            }
        }
}
