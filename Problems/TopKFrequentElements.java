package Problems;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        // Create a hash map to store the frequency of each element in the array
        HashMap<Integer, Integer> map = new HashMap<>();
        // Iterate through the array and populate the hash map
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // Create a min-heap (priority queue) to store the elements based on their frequency
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(n -> map.get(n)));
        // Iterate through the hash map and push each element and its frequency into the heap
        for (int num : map.keySet()) {
            pq.offer(num);
            pq.offer(map.get(num));
        }
        // Create an array to store the result
        int[] res = new int[k];
        // Pop k elements from the heap and store them in the result array
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll();
        }
        // Return the result array
        return res;
    }
}
