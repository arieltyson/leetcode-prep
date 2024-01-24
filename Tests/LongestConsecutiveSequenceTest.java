package Tests;

import Problems.LongestConsecutiveSequence;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestConsecutiveSequenceTest {
    @Test
    public void testLongestConsecutive() {
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();

        int[] nums1 = {100, 4, 200, 1, 3, 2};
        assertEquals(4, longestConsecutiveSequence.longestConsecutive(nums1));

        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        assertEquals(9, longestConsecutiveSequence.longestConsecutive(nums2));
    }
}
