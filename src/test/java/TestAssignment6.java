import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestAssignment6 {
    @Test
    public void testPrintDIvidedBy() {
        Object expected[] = new Object[]{15, 30, 45, 60, 75, 90};
        Object actual[] = Assignment6.multiplesInRange(1, 100, 3, 5).toArray();
        assertArrayEquals(expected, actual);
    }
}
