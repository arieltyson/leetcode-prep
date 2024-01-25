package ArrayAndHashingTests;

import ArrayAndHashingProblems.TopKFrequentElements;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {

    @Test
    void topKFrequent() {
        TopKFrequentElements solution = new TopKFrequentElements();

        int[] nums1 = {1,1,1,2,2,3};
        int k1 = 2;
        int[] expected1 = {1,2};
        int[] result1 = solution.topKFrequent(nums1, k1);
        Arrays.sort(expected1);
        Arrays.sort(result1);
        assertArrayEquals(expected1, result1);

        int[] nums2 = {1};
        int k2 = 1;
        int[] expected2 = {1};
        int[] result2 = solution.topKFrequent(nums2, k2);
        Arrays.sort(expected2);
        Arrays.sort(result2);
        assertArrayEquals(expected2, result2);
    }
}
