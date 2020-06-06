package com.example.jpa5.controladores;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraControllerTest {

    @Test
    @DisplayName("A soma deve somar corretamente 2 números reais")
    void somar() {
        CalculadoraController controller = new CalculadoraController();

        double n1 = 10;
        double n2 = 20;
        double esperado = 30;
        ResponseEntity resposta =  controller.somar(n1, n2);
        assertEquals(30.0, resposta.getBody(), "Soma entre "+n1+ "e"+ n2 + " deve dar "+esperado);


        n1 = 35;
        n2 = 65;
        esperado = 100;
        resposta = controller.somar(n1,n2);
        assertEquals(100.0, resposta.getBody(), "Soma entre "+n1+ "e"+ n2 + " deve dar "+esperado);
    }

    @Test
    @DisplayName("A divisão deve dividir corretamente 2 números reais")
    void dividir(){
        CalculadoraController controller = new CalculadoraController();

        //cenário 1
        double n1 = 40;
        double n2 = 2;
        double esperado = 20;
        ResponseEntity resposta =  controller.dividir(n1, n2);
        assertEquals(200, resposta.getStatusCodeValue(), "Divisão possível retorna status 200");
        assertEquals(esperado, resposta.getBody(), "Divisão entre "+n1+ "e"+ n2 + " deve dar "+esperado);

        //cenário 2
        n1 = 15;
        n2 = 0;
        resposta =  controller.dividir(n1, n2);
        assertEquals(400, resposta.getStatusCodeValue(), "Divisão por 0 retorna status 400");
        assertEquals("Não posso dividir por 0!", resposta.getBody());
    }

    @Test
    @DisplayName("Tudo Ok")
    void mediana(){
        CalculadoraController controller = new CalculadoraController();

        double m1 = 7;
        double fr1 = 80;
        ResponseEntity resposta =  controller.mediana(m1, fr1);
        assertEquals(201, resposta.getStatusCodeValue(), "retorna status 201");

    }

    @Test
    @DisplayName("Apenas o valor de média inválido")
    void media(){
        CalculadoraController controller = new CalculadoraController();

        double m1 = 4;
        double fr1 = 80;
        ResponseEntity resposta =  controller.mediana(m1, fr1);
        assertEquals(400, resposta.getStatusCodeValue(), "retorna status 400");
        assertEquals(resposta.getBody(),"A média deve ser entre 5.0 e 10.0. Você tentou com "+ m1);
    }

    @Test
    @DisplayName("Apenas o valor de frequencia inválido")
    void frequencia(){

        CalculadoraController controller = new CalculadoraController();

        double m1 = 7;
        double fr1 = 800;
        ResponseEntity resposta =  controller.mediana(m1, fr1);
        assertEquals(400, resposta.getStatusCodeValue(), "retorna status 400");
        assertEquals("A frequencia deve ser entre 60 e 100. Você tentou com "+ fr1, resposta.getBody());
    }

    @Test
    @DisplayName("Valor de frequencia e média inválidos")
    void frequenciaAndMedia(){
        CalculadoraController controller = new CalculadoraController();

        double m1 = 3;
        double fr1 = 800;
        ResponseEntity resposta =  controller.mediana(m1, fr1);
        assertEquals(400, resposta.getStatusCodeValue(), "retorna status 400");
        assertEquals("Mano, sério?! Tudo errado!",resposta.getBody());
    }

    @Test
    void testarConfigs() throws NoSuchMethodException {
        Class classe = CalculadoraController.class;

        assertTrue(classe.isAnnotationPresent(RestController.class),
                "A controller deve estar anotado com @Rescontroller");

        Method somar = classe.getDeclaredMethod("somar", Double.class, Double.class);
        assertTrue(somar.isAnnotationPresent(GetMapping.class),
                "O método somar() deve estar anotado com @GetMapping");


        String uriEsperada = "/somar/{n1}/{n2}";
        assertEquals(somar.getDeclaredAnnotation(GetMapping.class).value()[0],
                uriEsperada, "O endpoint em somar() deve ter a URI "+uriEsperada);

        Method dividir = classe.getDeclaredMethod("dividir", Double.class, Double.class);
        assertTrue(dividir.isAnnotationPresent(GetMapping.class),
                "O método dividir() deve estar anotado com @GetMapping");


        String uriEsperada2 = "/dividir/{n1}/{n2}";
        assertEquals(dividir.getDeclaredAnnotation(GetMapping.class).value()[0],
                uriEsperada2, "O endpoint em dividir() deve ter a URI "+uriEsperada2);

    }
    
}