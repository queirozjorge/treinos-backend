package br.com.jrqtech.treinos.services;

import br.com.jrqtech.treinos.models.entities.Usuario;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class TokenService {

    @Value("${security.auth.algorithm}")
    private String algorithm;

    @Value("${security.auth.issuer}")
    private String issuer;

    public String gerarToken(Usuario usuario) {
        return JWT.create()
                .withIssuer(issuer)
                .withSubject(usuario.getUsername())
                .withClaim("id", usuario.getId().toString())
                .withExpiresAt(LocalDateTime.now()
                        .plusMinutes(30)
                        .toInstant(ZoneOffset.of("-03:00"))
                ).sign(Algorithm.HMAC256(algorithm));
    }

    public String getSubject(String token) {
        return JWT.require(Algorithm.HMAC256(algorithm))
                .withIssuer(issuer)
                .build().verify(token).getSubject();
    }
}
