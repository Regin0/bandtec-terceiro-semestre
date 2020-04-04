package br.com.bandtec.corporequisicao.controllers;

import br.com.bandtec.corporequisicao.modelo.Animal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    private Animal animal;

    @GetMapping
    public ResponseEntity getAnimal(){
        if (this.animal == null){
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.ok(this.animal);
        }
    }

    @PostMapping
    public ResponseEntity criarAnimal(@RequestBody Animal novoAnimal){
        this.animal = novoAnimal;
        //return ResponseEntity.created(null).build();
        //201 = Criado;
        //200 = Ok;
        return ResponseEntity.status(201).build();
    }

    @DeleteMapping
    public ResponseEntity deletarAnimal(){
        if(this.animal == null){
            return ResponseEntity.notFound().build();
        }else{
            this.animal = null;
            return ResponseEntity.ok().build();
        }
    }
}
