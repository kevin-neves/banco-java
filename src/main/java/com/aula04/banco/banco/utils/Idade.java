package com.aula04.banco.banco.utils;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = IdadeValidador.class)
public @interface Idade {
    String message() default "IDADE INVÁLIDA";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default  {};
}
