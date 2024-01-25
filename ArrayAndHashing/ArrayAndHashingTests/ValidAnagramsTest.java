package ArrayAndHashing.ArrayAndHashingTests;

import ArrayAndHashing.ArrayAndHashingProblems.ValidAnagrams;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidAnagramsTest {
    @Test
    public void testIsAnagram() {
        ValidAnagrams validAnagram = new ValidAnagrams();
        assertTrue(validAnagram.isAnagram("anagram", "nagaram"));
        assertFalse(validAnagram.isAnagram("rat", "car"));
    }
}

