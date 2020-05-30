package com.example.jpa4clienterest.controladores;


import com.example.jpa4clienterest.clientes.ClienteConversaoMoedas;
import com.example.jpa4clienterest.clientes.ClienteViaCep;
import com.example.jpa4clienterest.modelos.Cep;
import com.example.jpa4clienterest.modelos.ConversaoMoeda;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/consultas")
public class ConsultasController {

    @Autowired
    private ClienteViaCep clienteViaCep;

    @Autowired
    private ClienteConversaoMoedas clienteConversao;

    @GetMapping("/cep/{cep}")
    public ResponseEntity consultarCep(@PathVariable String cep){
        Cep cepEncontrado = clienteViaCep.getCep(cep);
        return ResponseEntity.ok(cepEncontrado);
    }


    /*
    /consultas/cambio/CAD/EUR
    /consultas/cambio/CAD/USD
    /consultas/cambio/BRL/USD
    /consultas/cambio/BRL/EUR
    /consultas/cambio/USD/BRL
    /consultas/cambio/EUR/BRL
     */

    @GetMapping("/cambio/{de}/{para}")
    public ResponseEntity cambio(@PathVariable String de, @PathVariable String para){
        try{
            ConversaoMoeda conversao = clienteConversao.getConversao(de, para);
            return ResponseEntity.ok(conversao);
        }catch (FeignException erro){
            return ResponseEntity.status(erro.status()).body(erro.contentUTF8());
        }
    }

    @GetMapping("/cambio/{data}")
    public ResponseEntity euro(@PathVariable String data){
        try {
            ConversaoMoeda convert = clienteConversao.getEuro(data);
            return ResponseEntity.ok(convert);
        }catch (FeignException erro){
            return ResponseEntity.status(erro.status()).body(erro.contentUTF8());
        }
    }
}
