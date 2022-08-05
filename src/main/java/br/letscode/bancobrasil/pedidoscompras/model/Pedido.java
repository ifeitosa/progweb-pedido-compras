package br.letscode.bancobrasil.pedidoscompras.model;

import br.letscode.bancobrasil.pedidoscompras.model.enums.StatusPedidoEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Cliente cliente;

    private LocalDateTime dataPedido;

    private StatusPedidoEnum status;

    private String mensagemStatus;

    @OneToMany(mappedBy = "pedido")
    private Set<ItemPedido> itens;

}
