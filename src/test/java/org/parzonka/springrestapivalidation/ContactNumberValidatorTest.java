package org.parzonka.springrestapivalidation;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.parzonka.springrestapivalidation.exception.WrongPhoneNumberException;
import org.parzonka.springrestapivalidation.validator.ContactNumberValidator;

import javax.validation.ConstraintValidatorContext;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

@RunWith(MockitoJUnitRunner.class)
public class ContactNumberValidatorTest {

    @InjectMocks
    private ContactNumberValidator validator;

    @Mock
    private ConstraintValidatorContext context;

    @Test
    public void emptyPhoneNumberTest(){
        assertThatThrownBy(() -> validator.isValid("", context))
        .hasMessage("Wrong phone number!")
        .isInstanceOf(WrongPhoneNumberException.class);
    }
    @Test
    public void nullPhoneNumberTest(){
        assertThatThrownBy(() -> validator.isValid(null, context))
        .hasMessage("Wrong phone number!")
        .isInstanceOf(WrongPhoneNumberException.class);
    }

    @Test
    public void wrongPhoneNumberTest(){
        assertThatThrownBy(() -> validator.isValid("sdawcaw", context))
        .hasMessage("Wrong phone number!")
        .isInstanceOf(WrongPhoneNumberException.class);
    }

    @Test
    public void correctPhoneNumberTest(){
        Assert.assertTrue(validator.isValid("111222333", context));
    }


}
