package ArrayAndHashing.ArrayAndHashingTests;

import ArrayAndHashing.ArrayAndHashingProblems.ContainsDuplicate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContainsDuplicateTest {
    @Test
    public void testContainsDuplicate() {
        ContainsDuplicate test = new ContainsDuplicate();

        int[] nums1 = {1, 2, 3, 1};
        assertTrue(test.containsDuplicate(nums1), "Array contains duplicates");

        int[] nums2 = {1, 2, 3, 4};
        assertFalse(test.containsDuplicate(nums2), "Array does not contain duplicates");

        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertTrue(test.containsDuplicate(nums3), "Array contains duplicates");
    }
}

