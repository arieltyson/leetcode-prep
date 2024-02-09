package BinarySearch.BinarySearchTests;

import BinarySearch.BinarySearchProblems.FindMinimumInRotatedSortedArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMinimumInRotatedSortedArrayTest {

    @Test
    public void testFindMin() {
        FindMinimumInRotatedSortedArray solution = new FindMinimumInRotatedSortedArray();

        int[] nums1 = {3, 4, 5, 1, 2};
        assertEquals(1, solution.findMin(nums1));

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(0, solution.findMin(nums2));

        int[] nums3 = {11, 13, 15, 17};
        assertEquals(11, solution.findMin(nums3));
    }
}