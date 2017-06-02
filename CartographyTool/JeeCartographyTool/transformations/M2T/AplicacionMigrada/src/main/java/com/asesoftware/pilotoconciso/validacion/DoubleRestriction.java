package com.asesoftware.pilotoconciso.validacion;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * Anotación para validar un campo double
 * @author cadmilo
 */
@Target({METHOD, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = DoubleValidator.class)
public @interface DoubleRestriction {

    int minDecimalPlaces() default 0;

    int maxDecimalPlaces() default 1;

    double minValue() default 0;

    double maxValue() default Double.MAX_VALUE;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String message() default "{sigaces.validator.DoubleRestriction.message}";
}
