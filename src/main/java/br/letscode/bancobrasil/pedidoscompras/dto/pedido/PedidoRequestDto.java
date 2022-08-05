package br.letscode.bancobrasil.pedidoscompras.dto.pedido;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PedidoRequestDto {

    private List<ItemPedidoDto> itens;

}
