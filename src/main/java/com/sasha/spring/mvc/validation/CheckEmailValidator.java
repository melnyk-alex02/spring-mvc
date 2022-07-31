package com.sasha.spring.mvc.validation;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator implements ConstraintValidator<checkemail, String> {
    private String end_of_email;

    @Override
    public void initialize(checkemail checkemail) {
        end_of_email = checkemail.value();
    }

    @Override
    public boolean isValid(String enteredValue, ConstraintValidatorContext constraintValidatorContext) {
        return enteredValue.endsWith(end_of_email);
    }
}
