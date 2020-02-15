package ru.Eltex;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import ru.Eltex.domain.Reservation;

public class ReservationTest {
    private Reservation reservationTest;

    @Test
    public void setReservationText() {
        reservationTest = new Reservation();
        String expected = "Test";
        reservationTest.setText(expected);
        Assert.assertEquals(expected, reservationTest.getText());
    }

    @Test
    public void setReservationTable() {
        reservationTest = new Reservation();
        String expected = "3";
        reservationTest.setTable(expected);
        Assert.assertEquals(expected, reservationTest.getTable());
    }

    @Test
    public void setReservationData() {
        reservationTest = new Reservation();
        String expected = "22.02.22";
        reservationTest.setData(expected);
        Assert.assertEquals(expected, reservationTest.getData());
    }

    @Test
    public void setReservationTime() {
        reservationTest = new Reservation();
        String expected = "22:07";
        reservationTest.setTime(expected);
        Assert.assertEquals(expected, reservationTest.getTime());
    }

    @Test
    public void setReservationNofP() {
        reservationTest = new Reservation();
        String expected = "8000000000000";
        reservationTest.setNofP(expected);
        Assert.assertEquals(expected, reservationTest.getNofP());
    }
}
