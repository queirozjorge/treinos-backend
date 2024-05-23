package br.com.jrqtech.treinos.models.enums;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class GrupoMuscularConverter implements AttributeConverter<GrupoMuscularEnum, Integer> {

    @Override
    public Integer convertToDatabaseColumn(GrupoMuscularEnum grupoMuscular) {
        if (grupoMuscular == null) {
            return null;
        }
        return grupoMuscular.getId();
    }

    @Override
    public GrupoMuscularEnum convertToEntityAttribute(Integer id) {
        if (id == null) {
            return null;
        }
        return GrupoMuscularEnum.get(id);
    }
}