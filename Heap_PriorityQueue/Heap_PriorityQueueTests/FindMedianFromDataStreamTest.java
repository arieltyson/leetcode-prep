package Heap_PriorityQueue.Heap_PriorityQueueTests;

import Heap_PriorityQueue.Heap_PriorityQueueProblems.FindMedianFromDataStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMedianFromDataStreamTest {
    @Test
    public void testFindMedianFromDataStream() {
        FindMedianFromDataStream findMedian = new FindMedianFromDataStream();

        // Test case 1: add 1, 2, 3, 4, 5 and check median
        findMedian.addNum(1);
        findMedian.addNum(2);
        assertEquals(1.5, findMedian.findMedian(), 0.00001);
        findMedian.addNum(3);
        assertEquals(2, findMedian.findMedian(), 0.00001);
        findMedian.addNum(4);
        assertEquals(2.5, findMedian.findMedian(), 0.00001);
        findMedian.addNum(5);
        assertEquals(3, findMedian.findMedian(), 0.00001);

        // Test case 2: add 1000, 2000, 3000 and check median
        findMedian = new FindMedianFromDataStream();
        findMedian.addNum(1000);
        findMedian.addNum(2000);
        assertEquals(1500, findMedian.findMedian(), 0.00001);
        findMedian.addNum(3000);
        assertEquals(2000, findMedian.findMedian(), 0.00001);

        // Test case 3: add negative numbers and check median
        findMedian = new FindMedianFromDataStream();
        findMedian.addNum(-1);
        findMedian.addNum(-2);
        assertEquals(-1.5, findMedian.findMedian(), 0.00001);
        findMedian.addNum(-3);
        assertEquals(-2, findMedian.findMedian(), 0.00001);
    }
}
