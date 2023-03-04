package com.github.litemall.common.envm;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

@Slf4j
@Converter
public class MyAttributeConverter<T extends Enum<T> & BaseEnum> implements AttributeConverter<BaseEnum, String> {

    private final Class<T> clazz;

    public MyAttributeConverter(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    public String convertToDatabaseColumn(BaseEnum attribute) {
        return Optional.ofNullable(attribute).map(BaseEnum::getValue).orElse(null);
    }

    @Override
    public BaseEnum convertToEntityAttribute(String dbData) {
        return Arrays.stream(clazz.getEnumConstants()).filter(v -> Objects.equals(dbData, v.getValue())).findAny().orElse(null);
    }

}
