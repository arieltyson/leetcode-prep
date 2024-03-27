package SlidingWindow.SlidingWindowTests;

import org.junit.jupiter.api.Test;

import SlidingWindow.SlidingWindowProblems.LongestRepeatingCharacterReplacement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestRepeatingCharacterReplacementTest {

    @Test
    public void testCharacterReplacement() {
        LongestRepeatingCharacterReplacement solution = new LongestRepeatingCharacterReplacement();

        assertEquals(4, solution.characterReplacement("ABAB", 2));
        assertEquals(4, solution.characterReplacement("AABABBA", 1));
        assertEquals(2, solution.characterReplacement("AAB", 0));
        assertEquals(3, solution.characterReplacement("AAAB", 0));
        assertEquals(4, solution.characterReplacement("AAABB", 1)); // Updated this line
        assertEquals(5, solution.characterReplacement("AAAAB", 1)); // Added this line
        assertEquals(0, solution.characterReplacement("", 1));
    }
}