package SlidingWindow.SlidingWindowTests;

import SlidingWindow.SlidingWindowProblems.BestTimeToBuyAndSellStock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuyAndSellStockTest {
    @Test
    public void testMaxProfit() {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();

        // Test case 1: Maximum profit is 5 (buy on day 2 and sell on day 5)
        assertEquals(5, solution.maxProfit(new int[] {7, 1, 5, 3, 6, 4}));

        // Test case 2: Maximum profit is 0 (price keeps decreasing)
        assertEquals(0, solution.maxProfit(new int[] {7, 6, 4, 3, 1}));

        // Test case 3: Maximum profit is 2 (buy on day 1 and sell on day 2)
        assertEquals(2, solution.maxProfit(new int[] {2, 4, 1}));

        // Test case 4: Empty array, profit should be 0
        assertEquals(0, solution.maxProfit(new int[] {}));
    }
}
