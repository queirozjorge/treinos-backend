package br.com.jrqtech.treinos.controllers;

import br.com.jrqtech.treinos.exceptions.InvalidRequestException;
import br.com.jrqtech.treinos.models.entities.Usuario;
import br.com.jrqtech.treinos.models.dto.LoginRequest;
import br.com.jrqtech.treinos.models.dto.LoginResponse;
import br.com.jrqtech.treinos.services.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity login(@RequestBody LoginRequest login) {
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
                new UsernamePasswordAuthenticationToken(login.getEmail(), login.getPassword());
        try {
            Authentication authenticate = this.authenticationManager.authenticate(usernamePasswordAuthenticationToken);
            var usuario = (Usuario) authenticate.getPrincipal();
            return ResponseEntity.ok(
                    LoginResponse.builder()
                            .token(tokenService.gerarToken(usuario))
                            .name(usuario.getUsername())
                            .build()
            );
        } catch (Exception e) {
            throw new InvalidRequestException("Falha ao realizar login");
        }
    }

}
