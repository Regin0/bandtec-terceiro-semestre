package br.com.bandtec.jpa1.controllers;

import br.com.bandtec.jpa1.entidades.Cidade;
import br.com.bandtec.jpa1.repositorios.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cidades")
public class CidadeController {

    @Autowired
    private CidadeRepository repository;

    @PostMapping
    public ResponseEntity criarCidade(@RequestBody Cidade novaCidade) {
        repository.save(novaCidade);
        return ResponseEntity.created(null).build();
    }


    @GetMapping
    public ResponseEntity getCidades() {
        List<Cidade> lista = repository.findAll();

        if (lista.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(lista);
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity deletarCidade(@PathVariable Integer id) {

        if (repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @GetMapping("/contagem/{id}")
    public ResponseEntity getContagem(@PathVariable Integer id) {
        return ResponseEntity.ok(repository.count());
    }
}
