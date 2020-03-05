package br.com.bandtec.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {

    private List<ItemCompra> itensCompra = new ArrayList<>();

    @GetMapping("/comprar/{item}/{valor}/{quantidade}")
    public void comprar(
            @PathVariable("item") String item,
            @PathVariable("valor") Double valor,
            @PathVariable("quantidade") Integer quantidade) {

        ItemCompra itemCompra = new ItemCompra(item, valor, quantidade);
        itensCompra.add(itemCompra);
    }

    @GetMapping
    public List<ItemCompra> getItensCompra() {
        return itensCompra;
    }

    @GetMapping("/total")
    public TotalCompra getTotal() {
        TotalCompra total = new TotalCompra(this.itensCompra);
        return total;
    }
}
