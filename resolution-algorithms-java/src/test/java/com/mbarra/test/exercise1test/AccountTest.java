package com.mbarra.test.exercise1test;

import com.mbarra.exercises.exerciseone.Account;
import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    @Test
    public void test1(){
        Account a1 =  new Account("martha barra",1000);

        Assert.assertEquals("martha barra",a1.getHeadline());
    }

    @Test
    public void test2()
    {
        Account a2 =  new Account("inocencia quelca",2000);
        a2.withdraw(500);
        Assert.assertEquals(1500,a2.getAmount(),0.0001);

    }

}
