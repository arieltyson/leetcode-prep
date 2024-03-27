package SlidingWindow.SlidingWindowTests;

import SlidingWindow.SlidingWindowProblems.LongestSubstringWithoutRepeatingCharacters;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void testLengthOfLongestSubstring() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();

        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
        assertEquals(0, solution.lengthOfLongestSubstring(""));
        assertEquals(1, solution.lengthOfLongestSubstring(" "));
        assertEquals(2, solution.lengthOfLongestSubstring("au"));
    }
}
