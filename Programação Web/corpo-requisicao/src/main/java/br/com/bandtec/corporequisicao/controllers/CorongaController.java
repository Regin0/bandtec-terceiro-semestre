package br.com.bandtec.corporequisicao.controllers;

import br.com.bandtec.corporequisicao.modelo.Virus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/virus")
public class CorongaController {

    ArrayList<Virus> virus = new ArrayList<Virus>();

    @GetMapping
    public ResponseEntity<?> getVirus(){
        if (this.virus == null){
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.ok().body(this.virus);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getListVirus(@PathVariable("id") Integer id){
        if(virus.size() > id){
            if(virus.get(id) != null){
                return ResponseEntity.ok(virus.get(id));
            }else{
                return ResponseEntity.notFound().build();
            }
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<?> postVirus(@RequestBody Virus virus){
        this.virus.add(virus);
        return ResponseEntity.created(null).build();
    }
}


