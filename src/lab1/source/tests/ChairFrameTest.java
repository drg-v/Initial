package lab1.source.tests;

import lab1.source.ChairFrame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ChairFrameTest {

    @Test
    void testChairFrameDefaultConstructor(){
        ChairFrame obj = new ChairFrame();
        assertEquals(obj.getLength(), 10);
        assertEquals(obj.getWidth(), 10);
        assertEquals(obj.getHeight(), 10);
    }

    @Test
    void testChairFrameConstructor(){
        ChairFrame obj = new ChairFrame(10, 20, 30);
        assertEquals(obj.getLength(), 10);
        assertEquals(obj.getWidth(), 30);
        assertEquals(obj.getHeight(), 20);
    }
}
