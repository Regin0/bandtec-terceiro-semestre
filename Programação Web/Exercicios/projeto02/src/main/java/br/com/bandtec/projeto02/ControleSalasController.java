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

    @DeleteMapping("/excluir")
    public void excluirSala(){
        salas.clear();
    }

    @DeleteMapping("/excluir/{posicao}")
    public void excluirPosicao(@PathVariable("posicao") int i){
        salas.remove(i);
    }

    @PutMapping("/atualizar/{posicao}/{nome}/{capacidade}")
    public void atualiza(@PathVariable("posicao") Integer pos,
                         @PathVariable("nome") String name,
                         @PathVariable("capacidade") Integer cap){

        salas.get(pos).setNome(name);
        salas.get(pos).setCapacidade(cap);

//        Msm coisa do de cima porém com 1 linha
//        salas.set(pos, new Sala(name, cap));

    }

}
