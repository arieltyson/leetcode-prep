package TwoPointers.TwoPointersTests;

import TwoPointers.TwoPointersProblems.ThreeSum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class ThreeSumTest {
    @Test
    public void testThreeSum() {
        ThreeSum threeSum = new ThreeSum();

        // Test case 1: Normal case
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected1 = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );
        assertEquals(expected1, threeSum.threeSum(nums1));

        // Test case 2: All zeros
        int[] nums2 = {0, 0, 0, 0};
        List<List<Integer>> expected2 = Arrays.asList(
                Arrays.asList(0, 0, 0)
        );
        assertEquals(expected2, threeSum.threeSum(nums2));

        // Test case 3: No valid triplets
        int[] nums3 = {-1, 0, 1, 0};
        List<List<Integer>> expected3 = Arrays.asList(
                Arrays.asList(-1, 0, 1)
        );
        assertEquals(expected3, threeSum.threeSum(nums3));

        // Test case 4: Empty input
        int[] nums4 = {};
        List<List<Integer>> expected4 = Collections.emptyList();
        assertEquals(expected4, threeSum.threeSum(nums4));
    }
}
