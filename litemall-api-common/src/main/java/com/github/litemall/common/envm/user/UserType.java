package com.github.litemall.common.envm.user;

import com.github.litemall.common.envm.BaseEnum;
import com.github.litemall.common.envm.MyAttributeConverter;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UserType implements BaseEnum {

    APP_USER("1");

    private final String value;

    public static class Converter extends MyAttributeConverter<UserType> {

        public Converter() {
            super(UserType.class);
        }

    }

}
