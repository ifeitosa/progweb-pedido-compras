package br.letscode.bancobrasil.pedidoscompras.service.impl;

import br.letscode.bancobrasil.pedidoscompras.model.Cliente;
import br.letscode.bancobrasil.pedidoscompras.repository.ClienteRepository;
import br.letscode.bancobrasil.pedidoscompras.service.ClienteService;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

}
