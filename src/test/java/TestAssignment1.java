import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestAssignment1 {
    @Test
    public void testSumDigits(){
        assertEquals(Assignment1.sumDigits(565),16);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSumDigitsExceptionLess() {
        Assignment1.sumDigits(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSumDigitsExceptionMore() {
        Assignment1.sumDigits(1001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMainOneArg(){
        String[] args = new String[]{"-1"};
        Assignment1.main(args);
    }
}
