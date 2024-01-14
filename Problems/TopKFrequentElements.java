package Problems;

import java.util.HashMap;
import java.util.Map;
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
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) -> a.getValue() - b.getValue()
        );
        // Iterate through the hash map and push each element and its frequency into the heap
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        // Create an array to store the result
        int[] res = new int[k];
        // Pop k elements from the heap and store them in the result array
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll().getKey();
        }
        // Return the result array
        return res;
    }
}
