package org.example.algorithm;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeating {

    public static int getLongestSubstringWithoutRepeating(String input) {
        Map<Character, Integer> lastSeen = new HashMap<>();
        int left = 0, maxLen = 0;
        for (int right = 0; right < input.length(); right++) {
            char c = input.charAt(right);
            if (lastSeen.containsKey(c) && lastSeen.get(c) >= left) {
                left = lastSeen.get(c) + 1;
            }
            lastSeen.put(c, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    static void main() {
        String input = "abcabcbb";
        int longestSubStr = getLongestSubstringWithoutRepeating(input);
        System.out.println(input + " : " + longestSubStr);
    }
}
