package br.letscode.bancobrasil.pedidoscompras.dto.pedido;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemPedidoDto {

    private Long produtoId;
    private Integer quantidade;

}
