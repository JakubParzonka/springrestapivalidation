package org.parzonka.springrestapivalidation.validator;

import org.parzonka.springrestapivalidation.exception.WrongPhoneNumberException;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ContactNumberValidator implements ConstraintValidator<ContactNumberConstraint, String> {

    @Override
    public void initialize(ContactNumberConstraint contactNumber) {
    }

    @Override
    public boolean isValid(String contactField, ConstraintValidatorContext cxt) {
        if (!(contactField != null && contactField.matches("[0-9]+") && (contactField.length() > 8) && (contactField.length() < 14))) {
            throw new WrongPhoneNumberException();
        }
        return true;

    }

}
