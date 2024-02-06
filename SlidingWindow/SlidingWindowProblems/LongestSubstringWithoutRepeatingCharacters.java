package SlidingWindow.SlidingWindowProblems;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }

        int maxCount = 0;
        int left = 0;
        int right = 0;

        HashSet<Character> set = new HashSet<>();

        while (right < s.length()) {
            if (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            } else {
                set.add(s.charAt(right));
                right++;
            }
            maxCount = Math.max(maxCount,set.size());
        }
        return maxCount;
    }
}
