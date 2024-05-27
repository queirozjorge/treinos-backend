package br.com.jrqtech.treinos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class RecuperarSenhaService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private UsuarioService usuarioService;

    public void enviarEmail(String to, String link) {
        usuarioService.buscarPorEmail(to);
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("jorge.jpeg@gmail.com");
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject("Recuperação de senha");
        simpleMailMessage.setText("Para recuperar sua senha, clique no link a seguir:\n" + link);
        javaMailSender.send(simpleMailMessage);
    }

}
