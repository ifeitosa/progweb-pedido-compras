package br.letscode.bancobrasil.pedidoscompras.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Nome nao pode ser null")
    @NotEmpty(message = "Nome nao pode ser vazio")
    private String nome;

    @NotNull(message = "CPF nao pode ser null")
    @NotEmpty(message = "CPF nao pode ser vazio")
    private String cpf;

    @NotNull(message = "Email nao pode ser null")
    @NotEmpty(message = "Email nao pode ser vazio")
    @Email(message = "Email invalido")
    private String email;

    private String senha;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Endereco endereco;

}
