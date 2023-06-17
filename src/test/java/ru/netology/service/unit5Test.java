package ru.netology.service;

import org.junit.jupiter.api.Test;

public class Unit5Test {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void BoundaryValuesBelow() {
        org.junit.Assert.assertEquals(1, service.remain(999));
    }

    @Test
    public void AmountEqualZero() {
        org.junit.Assert.assertEquals(1000, service.remain(0));
    }

    @Test
    public void BoundaryValuesAbove() {
        org.junit.Assert.assertEquals(900, service.remain(1100));
    }
}

