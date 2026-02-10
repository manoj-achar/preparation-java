package org.example.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    static void main() {
        int[] input = {2, 7, 11, 15};
        int target = 13;

        int[] output = twoSum(input, target);
        System.out.println(Arrays.toString(output));
    }

    public static int[] twoSum(int[] input, int target) {
        int[] output = new int[2];
        Map<Integer, Integer> targetMap = new HashMap<>();
        for(int index = 0; index < input.length; index++) {
            int num = input[index];
            if(targetMap.containsKey(target - num)) {
                output[0] = targetMap.get(target - num);
                output[1] = index;
                break;
            }
            targetMap.put(num, index);
        }
        return output;
    }
}
