package br.letscode.bancobrasil.pedidoscompras.controller;

import br.letscode.bancobrasil.pedidoscompras.model.Cliente;
import br.letscode.bancobrasil.pedidoscompras.repository.ClienteRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.http.MimeHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeType;
import org.springframework.util.TypeUtils;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    @PostMapping
    public ResponseEntity<Cliente> save(@RequestBody @Valid Cliente cliente) {
        log.debug("Chegou a request do cliente: " + cliente.toString());
        return ResponseEntity.ok(clienteRepository.save(cliente));
    }

}
