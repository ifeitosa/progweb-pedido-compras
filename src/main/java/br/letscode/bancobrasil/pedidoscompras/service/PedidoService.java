package br.letscode.bancobrasil.pedidoscompras.service;

import br.letscode.bancobrasil.pedidoscompras.dto.pedido.PedidoRequestDto;
import br.letscode.bancobrasil.pedidoscompras.dto.pedido.PedidoResponseDto;

public interface PedidoService {

    PedidoResponseDto realizarPedido(PedidoRequestDto pedido);

}
