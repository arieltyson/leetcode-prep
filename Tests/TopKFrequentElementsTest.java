package Tests;

import Problems.TopKFrequentElements;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {

    @Test
    void topKFrequent() {
        TopKFrequentElements solution = new TopKFrequentElements();

        int[] nums1 = {1,1,1,2,2,3};
        int k1 = 2;
        int[] expected1 = {1,2};
        assertArrayEquals(expected1, solution.topKFrequent(nums1, k1));

        int[] nums2 = {1};
        int k2 = 1;
        int[] expected2 = {1};
        assertArrayEquals(expected2, solution.topKFrequent(nums2, k2));
    }
}


