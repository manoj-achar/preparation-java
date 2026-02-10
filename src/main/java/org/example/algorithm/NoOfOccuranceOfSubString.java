package org.example.algorithm;

public class NoOfOccuranceOfSubString {

    static void main() {
        String mainString = "qweqweabdhfklqwendjfqwehqwe";
        String subString = "qwe";
        int matchCount = 0;
        for(int i = 0; i<=mainString.length()-subString.length(); i++) {
            if(hasMatch(i, mainString, subString)) {
                matchCount++;
                i += subString.length()-1;
            }
        }
        System.out.println("Matching count = "+matchCount);

    }

    public static boolean hasMatch(int index, String mainString, String subString) {
        for(int i = 0; i<subString.length(); i++) {
            if(index >= mainString.length() || subString.charAt(i) != mainString.charAt(index++)) {
                return false;
            }
        }
        return true;
    }
}
