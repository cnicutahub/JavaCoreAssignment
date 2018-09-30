import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestAssignment3 {
    @Test
    public void testReverse(){
        assertEquals(Assignment3.reverse("1234"), "4321");
    }

    @Test
    public void testStringsToString(){
        String[] args = new String[]{"abcd","efgh"};
        assertEquals(Assignment3.stringsToString(args), "abcd efgh");
    }

    @Test
    public void testStringsToStringCompound(){
        String[] args = new String[]{"The quick brown fox"};
        assertEquals(Assignment3.reverse(Assignment3.stringsToString(args)), "xof nworb kciuq ehT");
    }
}
