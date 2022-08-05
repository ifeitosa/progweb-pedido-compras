package br.letscode.bancobrasil.pedidoscompras.service.impl;

import br.letscode.bancobrasil.pedidoscompras.dto.email.SendEmailDto;
import br.letscode.bancobrasil.pedidoscompras.service.SendEmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class SendEmailServiceImpl implements SendEmailService {

    /*final JavaMailSender javaMailSender;

    public SendEmailServiceImpl(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }*/

    @Override
    @Transactional(readOnly = true)
    public void send(final SendEmailDto sendEmailDto) {

        log.info("INICIO - Envio email - " + sendEmailDto);

        /*final SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(sendEmailDto.getPara());
        simpleMailMessage.setSubject(sendEmailDto.getAssunto());
        simpleMailMessage.setText(sendEmailDto.getMensagem());
        javaMailSender.send(simpleMailMessage);*/

        log.info("FIM - Envio email - " + sendEmailDto);

    }

}
