import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAssignment5 {
    @Test
    public void testProcess() {
        String str = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        int[] returns = Assignment5.process(str);
        assertEquals(returns[0], 23);
        assertEquals(returns[1], 9);
        assertEquals(returns[2], 10);
        assertEquals(returns[3], 6);
    }
}
