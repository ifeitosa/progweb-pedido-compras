package br.letscode.bancobrasil.pedidoscompras.service.impl;

import br.letscode.bancobrasil.pedidoscompras.dto.pedido.PedidoRequestDto;
import br.letscode.bancobrasil.pedidoscompras.dto.pedido.PedidoResponseDto;
import br.letscode.bancobrasil.pedidoscompras.service.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

    @Override
    public PedidoResponseDto realizarPedido(PedidoRequestDto pedido) {
        return new PedidoResponseDto(10L);
    }

}
