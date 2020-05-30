package com.example.jpa4clienterest.clientes;

import com.example.jpa4clienterest.modelos.ConversaoMoeda;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@FeignClient(value = "exchangeratesapi", url = "https://api.exchangeratesapi.io")
public interface ClienteConversaoMoedas {

    @GetMapping("/latest")
    ConversaoMoeda getConversao(@RequestParam String base,
                                @RequestParam String symbols);

    @GetMapping("/{data}")
    ConversaoMoeda getEuro(@PathVariable String data);
}

