import source.Chair;
import source.Manufacturer;
import source.enumeration.ChairLegs;
import source.exception.BrokenChair;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


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
        obj.isBroken();
        try {
            obj.showChair();
        } catch (BrokenChair brokenChair) {
            assertEquals(brokenChair.getMessage(), obj.getName() + " is broken");
        }

    }

    @Test
    void testChairBrokenChairMockException(){
        Chair myMock = mock(Chair.class);
        when(myMock.getName()).thenReturn("Name");
        try {
            doThrow(new BrokenChair("Name is broken")).when(myMock).showChair();
            myMock.showChair();
        } catch (BrokenChair brokenChair) {
            assertEquals(brokenChair.getMessage(), myMock.getName() + " is broken");
        }
        verify(myMock).getName();
        try {
            verify(myMock).showChair();
        } catch (BrokenChair brokenChair) {
            System.out.println(brokenChair.getMessage());
        }
    }

}
