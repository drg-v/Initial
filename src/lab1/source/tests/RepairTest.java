package lab1.source.tests;

import lab1.source.Chair;
import lab1.source.Repair;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RepairTest {

    @Test
    void testRepairChair(){
        Chair obj = new Chair();
        obj.isBroken = true;
        Repair.repairChair(obj);
        assertFalse(obj.isBroken);
    }

}
