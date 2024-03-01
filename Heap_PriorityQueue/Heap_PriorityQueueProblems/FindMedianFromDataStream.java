package Heap_PriorityQueue.Heap_PriorityQueueProblems;

import java.util.PriorityQueue;
import java.util.Comparator;

public class FindMedianFromDataStream {
    private PriorityQueue<Integer> small;
    private PriorityQueue<Integer> large;

    public FindMedianFromDataStream() {
        small = new PriorityQueue<>(Comparator.reverseOrder());
        large = new PriorityQueue<>();
    }

    public void addNum(int num) {
        small.offer(num);
        large.offer(small.poll());
        if (small.size() < large.size()){
            small.offer(large.poll());
        }
    }

    public double findMedian() {
        return small.size() > large.size() ? small.peek() : (small.peek() + large.peek()) / 2.0;
    }
}
