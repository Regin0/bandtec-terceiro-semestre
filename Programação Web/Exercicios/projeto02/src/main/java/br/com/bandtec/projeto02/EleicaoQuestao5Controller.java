//package br.com.bandtec.projeto02;
//
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/eleicao")
//public class EleicaoQuestao5Controller {
//
//    private EleicaoQuestao5 eleicao = new EleicaoQuestao5();
//    private boolean eleitorRegistrado = false;
//
//    @GetMapping("/resultado")
//    public EleicaoQuestao4 getEleicao() {
//        return eleicao;
//    }
//
//    @PostMapping("/registrar-eleitor/{idade}")
//    public String registarEleitor(
//            @PathVariable("idade") int idade) {
//        this.eleitorRegistrado = (idade >= 16);
//        return this.eleitorRegistrado ?
//                "Eleitor pode votar" : "Eleitor não tem idade mínima";
//    }
//
//    @PostMapping("/votar/{candidato}")
//    public String votar(
//            @PathVariable("candidato") int candidato) {
//        if (!this.eleitorRegistrado) {
//            return "Registre o eleitor primeiro";
//        }
//
//        this.eleitorRegistrado = false;
//        if (candidato==1) {
//            this.eleicao.registrarVoto1();
//        } else if (candidato==2) {
//            this.eleicao.registrarVoto2();
//        } else {
//            this.eleicao.registrarVotoInvalido();
//        }
//        return "Voto computado";
//    }
//
//}
