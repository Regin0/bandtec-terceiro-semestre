package br.com.bandtec.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sayajin")
public class SayajinController {

    private Double forcaBase;

    @GetMapping("/forca-base/{forca}")
    public void definirForca(@PathVariable("forca") Double novaForca) {
        this.forcaBase = novaForca;
    }

    @GetMapping("transformar/{forma}")
    public String transformar(@PathVariable("forma") String forma) {
        if (this.forcaBase == null) {
            return "Defina a força base antes!";
        }

        int multiplicador;
        if (forma.equals("ssj")) {
            multiplicador = 50;
        } else if (forma.equals("god")) {
            multiplicador = 200;
        } else if (forma.equals("blue")) {
            multiplicador = 500;
        } else if (forma.equals("base")) {
            multiplicador = 1;
        } else {
            return "Forma inválida!";
        }
        return "Forma atual: "+(this.forcaBase * multiplicador);
    }



}
