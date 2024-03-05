package TwoPointers.TwoPointersTests;

import TwoPointers.TwoPointersProblems.ContainerWithMostWater;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerWithMostWaterTest {
    @Test
    public void testMaxArea() {
        ContainerWithMostWater container = new ContainerWithMostWater();

        // Test case 1: Normal case
        int[] height1 = {1,8,6,2,5,4,8,3,7};
        int expected1 = 49;
        assertEquals(expected1, container.maxArea(height1));

        // Test case 2: All elements are the same
        int[] height2 = {5,5,5,5,5};
        int expected2 = 20;
        assertEquals(expected2, container.maxArea(height2));

        // Test case 3: Single element
        int[] height3 = {1};
        int expected3 = 0;
        assertEquals(expected3, container.maxArea(height3));

        // Test case 4: Two elements
        int[] height4 = {1, 2};
        int expected4 = 1;
        assertEquals(expected4, container.maxArea(height4));

        // Test case 5: Decreasing order
        int[] height5 = {9,8,7,6,5,4,3,2,1};
        int expected5 = 16;
        assertEquals(expected5, container.maxArea(height5));

        // Test case 6: Increasing order
        int[] height6 = {1,2,3,4,5,6,7,8,9};
        int expected6 = 16;
        assertEquals(expected6, container.maxArea(height6));
    }
}
