package br.com.jrqtech.treinos.models.enums;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class GrupoMuscularConverter implements AttributeConverter<GrupoMuscular, Integer> {

    @Override
    public Integer convertToDatabaseColumn(GrupoMuscular grupoMuscular) {
        if (grupoMuscular == null) {
            return null;
        }
        return grupoMuscular.getId();
    }

    @Override
    public GrupoMuscular convertToEntityAttribute(Integer id) {
        if (id == null) {
            return null;
        }
        return GrupoMuscular.get(id);
    }
}