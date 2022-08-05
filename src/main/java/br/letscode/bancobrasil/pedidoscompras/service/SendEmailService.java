package br.letscode.bancobrasil.pedidoscompras.service;

import br.letscode.bancobrasil.pedidoscompras.dto.email.SendEmailDto;

public interface SendEmailService {

    void send(SendEmailDto sendEmailDto);

}
