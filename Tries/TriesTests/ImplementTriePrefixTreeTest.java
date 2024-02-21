package Tries.TriesTests;

import Tries.TriesProblems.ImplementTriePrefixTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ImplementTriePrefixTreeTest {
    private ImplementTriePrefixTree trie;

    @BeforeEach
    void setUp() {
        trie = new ImplementTriePrefixTree();
    }

    @Test
    void testInsertAndSearch() {
        trie.insert("apple");
        assertTrue(trie.search("apple"), "The word 'apple' was inserted but not found");
        assertFalse(trie.search("app"), "The word 'app' was not inserted but found");
    }

    @Test
    void testInsertAndStartsWith() {
        trie.insert("apple");
        assertTrue(trie.startsWith("app"), "The prefix 'app' was inserted but not found");
        assertFalse(trie.startsWith("apl"), "The prefix 'apl' was not inserted but found");
    }

    @Test
    void testInsertSearchAndStartsWith() {
        trie.insert("apple");
        trie.insert("app");
        assertTrue(trie.search("app"), "The word 'app' was inserted but not found");
        assertTrue(trie.startsWith("app"), "The prefix 'app' was inserted but not found");
    }
}
