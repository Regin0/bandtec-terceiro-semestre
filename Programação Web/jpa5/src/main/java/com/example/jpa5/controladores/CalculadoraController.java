package com.example.jpa5.controladores;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @GetMapping("/somar/{n1}/{n2}")
    public ResponseEntity somar(@PathVariable Double n1, @PathVariable Double n2) {
        return ResponseEntity.ok(n1+n2);
    }


    @GetMapping("/dividir/{n1}/{n2}")
    public ResponseEntity dividir(@PathVariable Double n1, @PathVariable Double n2) {
        if (n2 == 0.0) {
            return ResponseEntity.badRequest().body("Não posso dividir por 0!");
        }
        return ResponseEntity.ok(n1/n2);
    }


    @PostMapping("/media-minima/{media}/frequencia-minima/{frequencia}")
    public ResponseEntity mediana(@PathVariable Double m1, @PathVariable Double fr1){
        if ((m1 < 5 || m1 >10) && (fr1 < 60 || fr1 >100)){
            return ResponseEntity.badRequest().body("Mano, sério?! Tudo errado!");
        }
        else if (fr1 < 60 || fr1 >100){
            return ResponseEntity.badRequest().body("A frequencia deve ser entre 60 e 100. Você tentou com "+ fr1);
        }
        else if (m1 < 5 || m1 >10){
            return ResponseEntity.badRequest().body("A média deve ser entre 5.0 e 10.0. Você tentou com "+ m1);
        }
        return ResponseEntity.status(201).build();
    }


}
