package SlidingWindow.SlidingWindowProblems;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxCount = 0, maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            maxCount = Math.max(maxCount, ++count[s.charAt(end) - 'A']);
            if (end - start + 1 - maxCount > k) {
                count[s.charAt(start) - 'A']--;
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
