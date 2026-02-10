package org.example.algorithm;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    static void main() {
        int[] input = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest consecutive sequence = "+longestConsecutiveSequence(input));
    }

    public static int longestConsecutiveSequence(int[] nums) {
        int longestSequence = 0;
        Set<Integer> numsSet = new HashSet<>();
        for(int num : nums) {
            numsSet.add(num);
        }
        for(int num : numsSet) {
            int currentSequence = 1;
            if(numsSet.contains(num-1)) continue;
            int nextNum = num+1;
            while(numsSet.contains(nextNum)) {
                currentSequence++;
                nextNum++;
            }
            longestSequence = Math.max(longestSequence, currentSequence);
        }
        return longestSequence;
    }
}
