package com.aula04.banco.banco.utils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IdadeValidador implements ConstraintValidator<Idade, Number> {
    @Override
    public boolean isValid(Number value, ConstraintValidatorContext context) {
        if(value.intValue() >= 18) { return true; }
        return false;
    }
}
