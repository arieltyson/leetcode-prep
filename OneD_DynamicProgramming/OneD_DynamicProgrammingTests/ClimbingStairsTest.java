package OneD_DynamicProgramming.OneD_DynamicProgrammingTests;

import OneD_DynamicProgramming.OneD_DynamicProgrammingProblems.ClimbingStairs;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbingStairsTest {
    @Test
    public void testClimbStairs() {
        ClimbingStairs cs = new ClimbingStairs();

        // Test edge cases
        assertEquals(1, cs.climbStairs(1), "Expected 1 way to climb 1 stair");
        assertEquals(2, cs.climbStairs(2), "Expected 2 ways to climb 2 stairs");

        // Test larger inputs
        assertEquals(3, cs.climbStairs(3), "Expected 3 ways to climb 3 stairs");
        assertEquals(5, cs.climbStairs(4), "Expected 5 ways to climb 4 stairs");
        assertEquals(8, cs.climbStairs(5), "Expected 8 ways to climb 5 stairs");

        // Test large input
        assertEquals(1836311903, cs.climbStairs(45), "Expected 1836311903 ways to climb 45 stairs");
    }
}
