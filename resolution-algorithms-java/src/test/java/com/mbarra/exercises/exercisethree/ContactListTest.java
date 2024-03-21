package com.mbarra.exercises.exercisethree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactListTest {

    @Test
    void hollowFree() {
        Contact c = new Contact("martha barra", 1138100184);
        ContactList ec = new ContactList();
        ec.addContact(c);

        Assertions.assertEquals(9, ec.hollowFree());
    }

}