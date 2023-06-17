package ru.netology.service;

public class unit5Test {
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

}
