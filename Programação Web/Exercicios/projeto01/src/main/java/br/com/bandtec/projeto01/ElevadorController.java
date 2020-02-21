package br.com.bandtec.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/elevador")
public class ElevadorController {

    private Double pesoMax;
    private Double pesoAtual=0.00;

    @GetMapping("/configurar/{peso}")
    public void peso(@PathVariable("peso") Double peso){
        this.pesoMax = peso;
    }
    @GetMapping("/subir/{quem}")
    public String subir(@PathVariable("quem") String quem){
        if (pesoMax == null){
            return "Primeiro Configure o peso máximo";
        }else{
            if(quem.equals("m")){
                this.pesoAtual+=90;
            }else if(quem.equals("f")){
                this.pesoAtual+=70;
            }else if(quem.equals("c")){
                this.pesoAtual+=40;
            }else{
                return "Valor Inválido, informe 'm', 'f' ou 'c'";
            }

            if (pesoAtual>=pesoMax){
                return "Alguem deve descer";
            }else{
                return "Elevador pode ir";
            }
        }
    }

    @GetMapping("/descer/{quem}")
    public String descer(@PathVariable("quem") String quem){
        if (pesoMax == null){
            return "Primeiro Configure o peso máximo";
        }else{
            if(quem.equals("m")){
                this.pesoAtual-=90;
            }else if(quem.equals("f")){
                this.pesoAtual-=70;
            }else if(quem.equals("c")){
                this.pesoAtual-=40;
            }else{
                return "Valor Inválido, informe 'm', 'f' ou 'c'";
            }

            if (pesoAtual>=pesoMax){
                return "Alguem deve descer";
            }else{
                return "Elevador pode ir";
            }
        }
    }
}
