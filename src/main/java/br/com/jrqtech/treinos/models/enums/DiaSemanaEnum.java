package br.com.jrqtech.treinos.models.enums;

import br.com.jrqtech.treinos.exceptions.EnumNotFoundException;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;

public enum DiaSemanaEnum {

    SEGUNDA(1),
    TERCA(2),
    QUARTA(3),
    QUINTA(4),
    SEXTA(5),
    SABADO(6),
    DOMINGO(7);

    private int id;

    DiaSemanaEnum(int id) {
        this.id = id;
    }

    @JsonValue
    public int getId() {
        return id;
    }

    @JsonCreator
    public static DiaSemanaEnum get(int id) {
        return Arrays.stream(DiaSemanaEnum.values())
                .filter(dia -> dia.id == id)
                .findFirst()
                .orElseThrow(() -> new EnumNotFoundException("Código do dia não existe"));
    }

}
