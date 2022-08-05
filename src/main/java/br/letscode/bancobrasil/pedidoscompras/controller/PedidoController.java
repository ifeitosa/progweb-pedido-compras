package br.letscode.bancobrasil.pedidoscompras.controller;

import br.letscode.bancobrasil.pedidoscompras.dto.pedido.PedidoRequestDto;
import br.letscode.bancobrasil.pedidoscompras.dto.pedido.PedidoResponseDto;
import br.letscode.bancobrasil.pedidoscompras.service.PedidoService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("/pedido")
public class PedidoController {

    final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }


    @Operation(description = "Realizar pedido de compras")
    @PostMapping
    public ResponseEntity<PedidoResponseDto> realizarPedido(@RequestBody @Valid PedidoRequestDto pedidoRequestDto) {
        return ResponseEntity.ok(pedidoService.realizarPedido(pedidoRequestDto));
    }


}
