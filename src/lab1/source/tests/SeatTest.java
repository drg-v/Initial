package lab1.source.tests;

import lab1.source.Seat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SeatTest {

    @Test
    void testSeatDefaultConstructor(){
        Seat obj = new Seat();
        assertEquals(obj.getWidth(), 10);
        assertEquals(obj.getHeight(), 10);
    }

    @Test
    void testSeatConstructor(){
        Seat obj = new Seat(20, 30);
        assertEquals(obj.getWidth(), 30);
        assertEquals(obj.getHeight(), 20);
    }
}
