package org.example.algorithm;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    static void main() {
        // Test 1: First unique character exists
        System.out.println("Test 1: First Unique Exists");
        String input1 = "swiss";
        System.out.println("Expected: w");
        System.out.println("Actual: " + firstNonRepeatingChar(input1));
        System.out.println();

        // Test 2: No unique character
        System.out.println("Test 2: No Unique Character");
        String input2 = "aabbcc";
        System.out.println("Expected: null");
        System.out.println("Actual: " + firstNonRepeatingChar(input2));
        System.out.println();

        // Test 3: First character is unique
        System.out.println("Test 3: First Character Unique");
        String input3 = "alphabet";
        System.out.println("Expected: l");
        System.out.println("Actual: " + firstNonRepeatingChar(input3));
        System.out.println();

        // Test 4: Mixed duplicates
        System.out.println("Test 4: Mixed Duplicates");
        String input4 = "success";
        System.out.println("Expected: u");
        System.out.println("Actual: " + firstNonRepeatingChar(input4));
        System.out.println();

        // Test 5: Empty string
        System.out.println("Test 5: Empty String");
        String input5 = "";
        System.out.println("Expected: null");
        System.out.println("Actual: " + firstNonRepeatingChar(input5));
        System.out.println();

    }

    public static Character firstNonRepeatingChar(String input) {
        Map<Character, Integer> charCounter = new LinkedHashMap<>();
        for(int i = 0; i< input.length(); i++) {
            char ch = input.charAt(i);
            charCounter.put(ch, charCounter.getOrDefault(ch, 0)+1);
        }
        Character firstNonRepeatingChar = null;
        for(Map.Entry<Character, Integer> entry : charCounter.entrySet()) {
            if(entry.getValue() == 1) {
                firstNonRepeatingChar = entry.getKey();
                break;
            }
        }
        return firstNonRepeatingChar;
    }
}
