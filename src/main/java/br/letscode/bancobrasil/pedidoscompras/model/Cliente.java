package br.letscode.bancobrasil.pedidoscompras.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Cliente {

    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String senha;

    private Endereco endereco;

}
