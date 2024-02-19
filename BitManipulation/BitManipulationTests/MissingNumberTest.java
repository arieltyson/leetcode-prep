package BitManipulation.BitManipulationTests;

import BitManipulation.BitManipulationProblems.MissingNumber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberTest {
    @Test
    public void testMissingNumber() {
        MissingNumber missingNumber = new MissingNumber();

        // Test case: Empty array
        assertEquals(0, missingNumber.missingNumber(new int[]{}));

        // Test case: Array with one element
        assertEquals(1, missingNumber.missingNumber(new int[]{0}));
        assertEquals(0, missingNumber.missingNumber(new int[]{1}));

        // Test case: Array with multiple elements
        assertEquals(2, missingNumber.missingNumber(new int[]{0, 1, 3}));
        assertEquals(0, missingNumber.missingNumber(new int[]{1, 2}));
        assertEquals(1, missingNumber.missingNumber(new int[]{0, 2}));
    }
}
