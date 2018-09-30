import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestAssignment4 {
    @Test
    public void testIsPalindrome() {
        assertFalse(Assignment4.isPalindrome("abcd"));
        assertTrue(Assignment4.isPalindrome("aabaa"));
        assertTrue(Assignment4.isPalindrome("aabbaa"));
    }
}
