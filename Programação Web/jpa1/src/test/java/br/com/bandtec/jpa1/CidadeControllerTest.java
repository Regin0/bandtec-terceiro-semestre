package br.com.bandtec.jpa1;


import br.com.bandtec.jpa1.controllers.CidadeController;
import br.com.bandtec.jpa1.entidades.Cidade;
import br.com.bandtec.jpa1.repositorios.CidadeRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest(classes = CidadeController.class)
public class CidadeControllerTest {

    @MockBean
    CidadeRepository repository;

    @Autowired
    CidadeController controller;

    @Test
    void deletarCidade(){
        //cenário 1 id válido
        Integer id = 99;
        List<Cidade> lista = new ArrayList<>(Arrays.asList(new Cidade(),new Cidade(),new Cidade()));

        Mockito.when(repository.findAll()).thenReturn(lista);
        ResponseEntity respostaAntes = controller.getCidades();
        int cidadesAntes = ((List) respostaAntes.getBody()).size();

        Mockito.when(repository.existsById(id)).thenReturn(true);

        Mockito.doAnswer(execucao -> lista.remove(0)).when(repository).deleteById(id);

        ResponseEntity respostaDelete = controller.deletarCidade(id);

        ResponseEntity respostaDepois = controller.getCidades();

        int cidadesDepoisDelete = ((List) respostaDepois.getBody()).size();

        //cenário 2 id inválido

        Mockito.when(repository.existsById(id)).thenReturn(false);

        respostaDelete = controller.deletarCidade(id);

        respostaDepois = controller.getCidades();

        int cidadesDepoisSegundoDelete = ((List) respostaDepois.getBody()).size();
        assertEquals(404, respostaDelete.getStatusCodeValue());
        assertEquals(cidadesDepoisDelete, cidadesDepoisSegundoDelete);
    }

    @Test
    void getCidades() {
        // cenário 1: o repository retorna 2 cidades
        List<Cidade> duasCidades = new ArrayList<>();
        duasCidades.add(new Cidade());
        duasCidades.add(new Cidade());


        Mockito.when(repository.findAll()).thenReturn(new ArrayList<>(duasCidades));

        ResponseEntity resposta = controller.getCidades();

        assertEquals(200, resposta.getStatusCodeValue(), "Lista com valores deve retornar status 200");
        assertEquals(duasCidades, resposta.getBody(), "Lista do endpoint deve ser fiel à do Repository");


        // cenário 2: o repositório não retorna nenhuma cidade (ou seja, lista vazia)
        Mockito.when(repository.findAll()).thenReturn(new ArrayList<>());

        resposta = controller.getCidades();

        assertEquals(204, resposta.getStatusCodeValue(), "Lista SEM valores deve retornar status 204");
        assertNull(resposta.getBody(), "Lista SEM valores deve retornar corpo vazio");
    }
}
