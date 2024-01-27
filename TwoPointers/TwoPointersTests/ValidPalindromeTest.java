package TwoPointers.TwoPointersTests;

import TwoPointers.TwoPointersProblems.ValidPalindrome;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void testIsPalindrome() {
        ValidPalindrome validPalindrome = new ValidPalindrome();

        assertTrue(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        assertTrue(validPalindrome.isPalindrome("race car"));
        assertFalse(validPalindrome.isPalindrome("race a car"));
    }
}

