package ru.netology.service;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void BoundaryValuesBelow() {
        org.junit.Assert.assertEquals(1, service.remain(999));
    }

    @org.junit.Test
    public void AmountEqualZero() {
        org.junit.Assert.assertEquals(1000, service.remain(0));
    }

    @org.junit.Test
    public void BoundaryValuesAbove() {
        org.junit.Assert.assertEquals(900, service.remain(1100));
    }


    @Test
    public void AmountMax() {
        assertEquals(service.remain(1000), 0);
    }


    @Test
    public void AmountBelowMax() {
//        assertEquals(service.remain(900), 100);
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void AmountZero() {
//        assertEquals(service.remain(0), 1000);
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
       assertEquals(actual, expected);
    }

    @Test
    public void AmountAboveMax() {
        assertEquals(service.remain(1100), 900);
    }

}
