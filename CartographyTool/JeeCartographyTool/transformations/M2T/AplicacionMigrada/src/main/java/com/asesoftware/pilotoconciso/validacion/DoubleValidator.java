package com.asesoftware.pilotoconciso.validacion;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Clase para validar las características de un campo double
 * @author cadmilo
 */
public class DoubleValidator implements ConstraintValidator<DoubleRestriction, Double> {

    DoubleRestriction dPlaces;

    @Override
    public void initialize(DoubleRestriction constraintAnnotation) {
        dPlaces = constraintAnnotation;
    }

    @Override
    public boolean isValid(Double value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        try {
            String[] parts = value.toString().replaceAll(",", ".").split("[.]");
            String sDPlaces = (parts.length>1 ? parts[1] : "");
            return sDPlaces.length() <= dPlaces.maxDecimalPlaces() && sDPlaces.length() >= dPlaces.minDecimalPlaces() && value>= dPlaces.minValue() && value <= dPlaces.maxValue();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return true;
    }
}
