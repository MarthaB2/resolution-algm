package com.mbarra.exercises.exercisethree;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContactListTest {

    @Test
    public void hollowFree() {
        Contact c = new Contact("martha barra",1138100184);
        ContactList ec =  new ContactList();
        ec.addContact(c);

        //ec.hollowFree();

        Assert.assertEquals(9,ec.hollowFree());
    }
}