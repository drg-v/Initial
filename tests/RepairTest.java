import source.Chair;
import source.Repair;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;


public class RepairTest {

    @Test
    void testRepairChair(){
        Chair obj = new Chair();
        obj.isBroken = true;
        Repair.repairChair(obj);
        assertFalse(obj.getIsBroken());
    }

    @Test
    void testRepairMockChair(){
        Chair myMock = mock(Chair.class);
        when(myMock.getIsBroken()).thenReturn(false);
        Repair.repairChair(myMock);
        assertFalse(myMock.getIsBroken());
        verify(myMock).getIsBroken();
    }
}
