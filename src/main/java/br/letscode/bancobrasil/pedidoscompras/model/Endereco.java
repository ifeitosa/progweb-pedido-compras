package br.letscode.bancobrasil.pedidoscompras.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Endereco {

    private Long id;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;

    private Cliente cliente;

}