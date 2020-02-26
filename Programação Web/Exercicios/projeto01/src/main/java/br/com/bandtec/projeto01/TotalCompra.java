package br.com.bandtec.projeto01;

import java.util.List;

public class TotalCompra {

    private Integer quantidadeItens;
    private Double totalCompra;

    public TotalCompra(List<ItemCompra> listaCompras) {
        this.quantidadeItens = listaCompras.size();

        totalCompra = 0.0;
        listaCompras.forEach( item -> {
            totalCompra += (item.getValor() * item.getQuantidade());
        });
    }

    public Integer getQuantidadeItens() {
        return quantidadeItens;
    }

    public Double getTotalCompra() {
        return totalCompra;
    }
}
