package ArrayAndHashingTests;

import ArrayAndHashingProblems.GroupAnagrams;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GroupAnagramsTest {
    @Test
    public void testGroupAnagrams() {
        GroupAnagrams ga = new GroupAnagrams();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("eat", "tea", "ate"),
                Arrays.asList("tan", "nat"),
                List.of("bat")
        );
        List<List<String>> actual = ga.groupAnagrams(strs);
        assertEquals(expected.size(), actual.size());
        for (List<String> group : actual) {
            assertTrue(expected.contains(group));
        }
    }
}
