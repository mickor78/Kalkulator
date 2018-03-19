package Kalkulator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTestKOLEJNA {

    @Test
    void addTwo() {
        //given
        //when
        double result=App.addTwo(2,2);
        //then
        assertEquals(4, result);
    }
    @Test
    void delta() {
        //given
        //when
        double delta = App.delta(2, 2, 2);
        //then
        assertEquals(-12,delta);
    }


}