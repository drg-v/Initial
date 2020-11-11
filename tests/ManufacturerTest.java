import source.Chair;
import source.Manufacturer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ManufacturerTest {

    @Test
    void testConstructorSingleObject(){
        Manufacturer obj = new Manufacturer("Name", new Chair());
        assertEquals(obj.getName(), "Name");
        assertEquals(obj.getModelsLength(), 1);
    }

    @Test
    void testConstructorSeveralObjects(){
        Manufacturer obj = new Manufacturer("Name", new Chair(), new Chair(), new Chair());
        assertEquals(obj.getName(), "Name");
        assertEquals(obj.getModelsLength(), 3);
    }

    @Test
    void testEqualsTrue(){
        Manufacturer obj = new Manufacturer("Name", new Chair(), new Chair(), new Chair());
        Manufacturer obj2 = new Manufacturer("Name", new Chair(), new Chair(), new Chair());
        assertTrue(obj.equals(obj2));
    }

    @Test
    void testEqualsFalse(){
        Manufacturer obj = new Manufacturer("Name", new Chair(), new Chair(), new Chair());
        Manufacturer obj2 = new Manufacturer("NotThis", new Chair(), new Chair(), new Chair());
        assertFalse(obj.equals(obj2));
    }
}
