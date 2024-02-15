package BitManipulation.BitManipulationTests;

import BitManipulation.BitManipulationProblems.CountingBits;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CountingBitsTest {
    @Test
    public void testCountBits() {
        CountingBits cb = new CountingBits();

        // Test case 1: num = 0
        assertArrayEquals(new int[]{0}, cb.countBits(0));

        // Test case 2: num = 1
        assertArrayEquals(new int[]{0, 1}, cb.countBits(1));

        // Test case 3: num = 2
        assertArrayEquals(new int[]{0, 1, 1}, cb.countBits(2));

        // Test case 4: num = 5
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, cb.countBits(5));

        // Test case 5: num = 10
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2}, cb.countBits(10));
    }
}
