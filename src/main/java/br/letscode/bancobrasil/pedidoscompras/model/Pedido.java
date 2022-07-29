package br.letscode.bancobrasil.pedidoscompras.model;

import br.letscode.bancobrasil.pedidoscompras.model.enums.StatusPedidoEnum;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
public class Pedido {

    private Long id;
    private Cliente cliente;
    private LocalDateTime dataPedido;
    private StatusPedidoEnum status;
    private Set<ItemPedido> itens;

}
