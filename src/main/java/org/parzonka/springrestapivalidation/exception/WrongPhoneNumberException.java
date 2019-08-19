package org.parzonka.springrestapivalidation.exception;

public class WrongPhoneNumberException extends RuntimeException {

    public WrongPhoneNumberException() {
        super("Wrong phone number!");
    }
}
