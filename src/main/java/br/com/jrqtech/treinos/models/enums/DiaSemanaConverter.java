package br.com.jrqtech.treinos.models.enums;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class DiaSemanaConverter implements AttributeConverter<DiaSemanaEnum, Integer> {

    @Override
    public Integer convertToDatabaseColumn(DiaSemanaEnum diaSemana) {
        if (diaSemana == null) {
            return null;
        }
        return diaSemana.getId();
    }

    @Override
    public DiaSemanaEnum convertToEntityAttribute(Integer id) {
        if (id == null) {
            return null;
        }
        return DiaSemanaEnum.get(id);
    }
}