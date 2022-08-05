package br.letscode.bancobrasil.pedidoscompras.controller;

import br.letscode.bancobrasil.pedidoscompras.model.Cliente;
import br.letscode.bancobrasil.pedidoscompras.repository.ClienteRepository;
import br.letscode.bancobrasil.pedidoscompras.service.ClienteService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService clienteService;
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @Operation(description = "Salvar um cliente")
    @PostMapping
    public ResponseEntity<Cliente> salvar(@RequestBody @Valid Cliente cliente) {
        return ResponseEntity.ok(clienteService.salvar(cliente));
    }

}
