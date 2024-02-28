package Tries.TriesTests;

import Tries.TriesProblems.WordSearch2;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordSearch2Test {
    @Test
    public void testFindWords() {
        WordSearch2 ws = new WordSearch2();
        char[][] board = {
                {'o','a','a','n'},
                {'e','t','a','e'},
                {'i','h','k','r'},
                {'i','f','l','v'}
        };
        String[] words = {"oath","pea","eat","rain"};
        List<String> expected = Arrays.asList("eat","oath");
        Collections.sort(expected);
        List<String> result = ws.findWords(board, words);
        Collections.sort(result);
        assertEquals(expected, result);
    }
}
