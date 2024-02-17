package BitManipulation.BitManipulationTests;

import BitManipulation.BitManipulationProblems.ReverseBits;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseBitsTest {
    @Test
    public void testReverseBits() {
        ReverseBits reverseBits = new ReverseBits();

        // Test case 1: Normal case
        assertEquals(964176192, reverseBits.reverseBits(43261596));

        // Test case 2: Reverse of maximum integer
        assertEquals(-2, reverseBits.reverseBits(Integer.MAX_VALUE));  // Corrected expected value

        // Test case 3: Reverse of minimum integer
        assertEquals(1, reverseBits.reverseBits(Integer.MIN_VALUE));

        // Test case 4: Reverse of zero
        assertEquals(0, reverseBits.reverseBits(0));
    }
}
