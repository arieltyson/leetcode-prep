package Tries.TriesTests;

import Tries.TriesProblems.DesignAddAndSearchWordsDataStructure;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DesignAddAndSearchWordsDataStructureTest {
    @Test
    void testAddAndSearchWords() {
        DesignAddAndSearchWordsDataStructure dict = new DesignAddAndSearchWordsDataStructure();

        dict.addWord("bad");
        dict.addWord("dad");
        dict.addWord("mad");

        assertFalse(dict.search("pad"));
        assertTrue(dict.search("bad"));
        assertTrue(dict.search(".ad"));
        assertTrue(dict.search("b.."));

        dict.addWord("pad");
        assertTrue(dict.search("pad"));
        assertFalse(dict.search("p.."));
        assertTrue(dict.search("..."));
    }
}
