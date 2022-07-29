package br.letscode.bancobrasil.pedidoscompras.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode
public class Produto {

    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private BigDecimal desconto;
    private Integer estoque;
    private String foto;

}
