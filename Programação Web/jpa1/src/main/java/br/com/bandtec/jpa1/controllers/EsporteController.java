package br.com.bandtec.jpa1.controllers;

import br.com.bandtec.jpa1.entidades.Esporte;
import br.com.bandtec.jpa1.repositorios.EsporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/esportes")
public class EsporteController {

    @Autowired
    private EsporteRepository repository;

    @PostMapping
    public ResponseEntity criarEsporte(@RequestBody Esporte novoEsporte) {
        repository.save(novoEsporte);
        return ResponseEntity.created(null).build();
    }

    @GetMapping
    public ResponseEntity listarTodos() {
        if (repository.count() > 0) {
            return ResponseEntity.ok(this.repository.findAll());
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity getEsporte(@PathVariable Integer id) {

        Optional<Esporte> consultaEsporte = repository.findById(id);

        if (consultaEsporte.isPresent()) {
            return ResponseEntity.ok(consultaEsporte.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletarEsporte(@PathVariable Integer id) {

        if (repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @PutMapping("/{id}")
    public ResponseEntity atualizarEsporte(@PathVariable Integer id, @RequestBody Esporte esporteAtualizado) {

        Optional<Esporte> consultaExistente = repository.findById(id);

        if (consultaExistente.isPresent()) {
            Esporte esporteEncontrado = repository.findById(id).get();

            esporteEncontrado.setNome(esporteAtualizado.getNome());
            esporteEncontrado.setOlimpico(esporteAtualizado.isOlimpico());

            repository.save(esporteEncontrado);

            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

