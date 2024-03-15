package com.mbarra.exercises.exerciseone;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void getHeadline() {
        Account a1 =  new Account("martha barra",1000);

        Assert.assertEquals("martha barra",a1.getHeadline());
    }

    @Test
    public void getAmount() {
        Account a2 =  new Account("inocencia quelca",2000);
        a2.withdraw(500);
        Assert.assertEquals(1500,a2.getAmount(),0.0001);
    }
}