package org.parzonka.springrestapivalidation.model;

import lombok.Getter;
import lombok.Setter;
import org.parzonka.springrestapivalidation.validator.ContactNumberConstraint;

@Setter
@Getter
public class ContactDataDTO {

    @ContactNumberConstraint
    private String phoneNumber;

}
