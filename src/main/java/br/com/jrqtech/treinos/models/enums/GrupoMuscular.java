package br.com.jrqtech.treinos.models.enums;

import br.com.jrqtech.treinos.exceptions.EnumNotFoundException;

import java.util.Arrays;

public enum GrupoMuscular {

    PEITO(1),
    COSTAS(2),
    OMBRO(3),
    PERNAS(4),
    GLUTEOS(5),
    PANTURRILHAS(6),
    BICEPS(7),
    TRICEPS(8),
    ABDOMEN(9);

    private int id;

    GrupoMuscular(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static GrupoMuscular get(int id) {
        return Arrays.stream(GrupoMuscular.values())
                .filter(grupo -> grupo.id == id)
                .findFirst()
                .orElseThrow(() -> new EnumNotFoundException("Grupo muscular não existe"));
    }

}
