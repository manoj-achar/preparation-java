package org.example.demo;

import java.util.*;

public class MinimizeDistinctValue {

    public static int minimizeDistinct(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> frequencies = new ArrayList<>(freqMap.values());
        Collections.sort(frequencies);
        int distinctCount = frequencies.size();
        for (int freq : frequencies) {
            if (k >= freq) {
                k -= freq;
                distinctCount--;
            } else {
                break;
            }
        }
        return distinctCount;
    }
    static void main(String[] args) {
        int[] nums = {4, 4, 4, 5, 5, 5, 5, 6, 6, 7};
        int k = 3;
        System.out.println(minimizeDistinct(nums, k)); // Output: 2
    }
}
