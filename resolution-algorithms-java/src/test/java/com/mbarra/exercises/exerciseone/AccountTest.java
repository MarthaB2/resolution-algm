package com.mbarra.exercises.exerciseone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getHeadline() {
        Account a1 = new Account("martha barra", 1000);

        Assertions.assertEquals("martha barra", a1.getHeadline());
    }

    @Test
    void getAmount() {
        Account a2 = new Account("inocencia quelca", 2000);
        a2.withdraw(500);
        Assertions.assertEquals(1500, a2.getAmount(), 0.0001);
    }
}