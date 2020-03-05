//package br.com.bandtec.projeto02;
//
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/eleicao-q6")
//public class EleicaoQuestao6Controller {
//
//    private EleicaoQuestao6 eleicao = new EleicaoQuestao6();
//    private boolean eleitorRegistrado = false;
//
//    @DeleteMapping
//    public void limparVotacao() {
//        this.eleicao.limpar();
//    }
//
//    @PutMapping("/candidato1/{nome}")
//    public void setNomeCandidato1(@PathVariable("nome") String nome) {
//        this.eleicao.setNomeCandidato1(nome);
//    }
//
//    @PutMapping("/candidato2/{nome}")
//    public void setNomeCandidato2(@PathVariable("nome") String nome) {
//        this.eleicao.setNomeCandidato2(nome);
//    }
//
//    // os métodos abaixo são relativos à questão 5
//
//    @GetMapping("/resultado")
//    public EleicaoQuestao4 getEleicao() {
//        return eleicao;
//    }
//
//    @PostMapping("/registrar-eleitor/{idade}")
//    public String registarEleitor(@PathVariable("idade") int idade) {
//        this.eleitorRegistrado = (idade >= 16);
//        return this.eleitorRegistrado ?
//                "Eleitor pode votar" : "Eleitor não tem idade mínima";
//    }
//
//    @PostMapping("/votar/{candidato}")
//    public String votar(@PathVariable("candidato") int candidato) {
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
//
//}
