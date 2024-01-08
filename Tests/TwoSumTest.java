package Tests;

import Problems.TwoSum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {
    @Test
    void testTwoSum() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, twoSum.twoSum(nums, target));

        nums = new int[]{3, 2, 4};
        target = 6;
        expected = new int[]{1, 2};
        assertArrayEquals(expected, twoSum.twoSum(nums, target));

        nums = new int[]{3, 3};
        expected = new int[]{0, 1};
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }
}
