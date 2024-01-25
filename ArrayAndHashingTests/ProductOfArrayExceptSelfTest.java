package ArrayAndHashingTests;

import ArrayAndHashingProblems.ProductOfArrayExceptSelf;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductOfArrayExceptSelfTest {
    @Test
    public void testProductExceptSelf() {
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();

        int[] nums1 = {1, 2, 3, 4};
        int[] expected1 = {24, 12, 8, 6};
        assertArrayEquals(expected1, productOfArrayExceptSelf.productExceptSelf(nums1));

        int[] nums2 = {-1, 1, 0, -3, 3};
        int[] expected2 = {0, 0, 9, 0, 0};
        assertArrayEquals(expected2, productOfArrayExceptSelf.productExceptSelf(nums2));
    }
}
