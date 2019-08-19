package org.parzonka.springrestapivalidation;

import org.parzonka.springrestapivalidation.model.ContactDataDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Validated
public class ContactDataResource {

    @PostMapping("/validate/contactData")
    public ResponseEntity validateContactData(@Valid @RequestBody ContactDataDTO contactDataDTO) {
        return ResponseEntity.ok(contactDataDTO.getPhoneNumber());
    }
}
