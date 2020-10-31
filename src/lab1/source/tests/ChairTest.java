package lab1.source.tests;

import lab1.source.Chair;
import lab1.source.Manufacturer;
import lab1.source.enumeration.ChairLegs;
import lab1.source.exception.BrokenChair;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ChairTest {

    @Test
    void testChairConstructor(){
        Manufacturer producer = new Manufacturer("Name", new Chair());

        Chair obj = new Chair(10, ChairLegs.FOUR, 10, 10, 10, 10, "Name", producer);
        assertEquals(obj.getName(), "Name");
        assertEquals(obj.getFrame().getHeight(), 10);
        assertEquals(obj.getFrame().getWidth(), 10);
        assertEquals(obj.getFrame().getLength(), 10);
        assertEquals(obj.getSitting().getHeight(), 10);
        assertEquals(obj.getSitting().getWidth(), 10);
        assertEquals(obj.getNum(), ChairLegs.FOUR);
        assertEquals(obj.getProducer(), producer);
    }

    @Test
    void testChairBrokenChairException(){
        Manufacturer producer = new Manufacturer("Name", new Chair());

        Chair obj = new Chair(10, ChairLegs.FOUR, 10, 10, 10, 10, "Name", producer);
        obj.isBroken = true;
        try {
            obj.showChair();
        } catch (BrokenChair brokenChair) {
            assertEquals(brokenChair.getMessage(), obj.getName() + " is broken");
        }

    }
}
