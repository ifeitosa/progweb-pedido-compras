package br.letscode.bancobrasil.pedidoscompras.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ItemPedido {

    private Pedido pedido;
    private Produto produto;
    private Integer quantidade;
    private BigDecimal preco;
    private BigDecimal desconto;

}
