package org.example.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubArraySum {

    static void main() {
        int[] input = {1, 2, 3, 4, 5};
        int target = 9;
        int[] output = subarraySum(input, target);
        System.out.println(Arrays.toString(output));
    }

    public static int[] subarraySum(int[] input, int target) {
        int[] output = new int[0];
        Map<Integer, Integer> expectedMap = new HashMap<>();
        expectedMap.put(0, -1);
        int sum = 0;
        for(int index = 0; index < input.length; index++) {
            int num = input[index];
            sum += num;
            int expected = sum - target;
            if(expectedMap.containsKey(expected)) {
                output = new int[2];
                output[0] = expectedMap.get(expected) + 1;
                output[1] = index;
                break;
            }
            expectedMap.put(sum, index);
        }
        return output;
    }
}
