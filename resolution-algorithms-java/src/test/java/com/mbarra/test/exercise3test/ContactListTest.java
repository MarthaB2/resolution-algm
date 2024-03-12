package com.mbarra.test.exercise3test;

import com.mbarra.exercises.exercisethree.Contact;
import com.mbarra.exercises.exercisethree.ContactList;
import org.junit.Test;
import org.junit.Assert;

public class ContactListTest {
    @Test
    public void test1(){
        Contact c = new Contact("martha barra",1138100184);
        ContactList ec =  new ContactList();
        ec.addContact(c);

        //ec.hollowFree();

        Assert.assertEquals(9,ec.hollowFree());

    }
}
