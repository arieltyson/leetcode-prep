package BitManipulation.BitManipulationTests;

import BitManipulation.BitManipulationProblems.NumberOf1Bits;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOf1BitsTest {
    @Test
    public void testHammingWeight() {
        NumberOf1Bits solution = new NumberOf1Bits();

        // Test with 0, expecting 0 as there are no 1 bits in 0
        assertEquals(0, solution.hammingWeight(0));

        // Test with the maximum positive integer, expecting 31 as there are 31 1 bits in Integer.MAX_VALUE
        assertEquals(31, solution.hammingWeight(Integer.MAX_VALUE));

        // Test with the minimum integer (which is negative), expecting 1 as there is 1 bit in Integer.MIN_VALUE
        assertEquals(1, solution.hammingWeight(Integer.MIN_VALUE));

        // Test with a random positive number
        assertEquals(3, solution.hammingWeight(11)); // 11 is '1011' in binary, which has three 1 bits

        // Test with a random negative number
        assertEquals(30, solution.hammingWeight(-11)); // -11 in binary representation has thirty 1 bits
    }
}
