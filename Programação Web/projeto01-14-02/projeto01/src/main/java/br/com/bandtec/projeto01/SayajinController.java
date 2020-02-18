package br.com.bandtec.projeto01;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sayajin")
public class SayajinController {
    private Double base;

    @GetMapping("/forca-base/{forca}")
    public void forcaBase(@PathVariable("forca") Double forca){
        this.base = forca;
    }

    @GetMapping("transformar/{forma}")
    public String transformar(@PathVariable("forma") String forma){
        Double calc;
        if (base == null){
            return "Defina a força base antes!";
        }else{
            if(forma.equals("ssj")){
                calc = base*50;
                return "Força atual "+calc;
            }else if(forma.equals("god")){
                calc = base*200;
                return "Força atual "+calc;
            }else if(forma.equals("blue")){
                calc = base*500;
                return "Força atual "+calc;
            }else if(forma.equals("base")){
                calc = base;
                return "Força atual "+calc ;
            }else{
                return "Erro, insira uma forma válida";
            }
        }
    }
}
