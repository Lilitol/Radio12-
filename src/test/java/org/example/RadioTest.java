package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void test() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);

        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void next() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldOverMaxStation1() {
        Radio radio;
        radio.setCurrentStation(9);
        radio.nextStation();
        Assertions.assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void test() {
        int currentStation;
        Radio radio = new Radio(stationsCount: 20);

        radio.setCurrentStation(17);

        int expected = 17;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

}