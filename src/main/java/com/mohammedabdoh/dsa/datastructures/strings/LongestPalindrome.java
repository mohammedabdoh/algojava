package com.mohammedabdoh.dsa.datastructures.strings;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static int solution(String s) {

        if(s.length() <= 1) {
            return s.length();
        }

        if(s.length() == 2 && s.charAt(0) != s.charAt(1)) {
            return 1;
        }

        Map<Character, Integer> chars = new HashMap<>();
        boolean hasAtLeastOneOddChar = false;
        int longestPlaindrome = 0;

        for (int i = 0; i < s.length(); i++) {
            Character currentChar = s.charAt(i);
            chars.put(currentChar, chars.getOrDefault(currentChar, 0) + 1);
        }

        for (Map.Entry<Character, Integer> element : chars.entrySet()) {
            if(element.getValue() == 1) {
                if(hasAtLeastOneOddChar) continue;
                else hasAtLeastOneOddChar = true;
            }

            if(element.getValue() % 2 == 0) {
                longestPlaindrome += element.getValue();
            } else {
                longestPlaindrome += element.getValue() - 1;
                hasAtLeastOneOddChar = true;
            }
        }

        if(longestPlaindrome >= 2) {
            return hasAtLeastOneOddChar ? ++longestPlaindrome : longestPlaindrome;
        } else {
            return 0;
        }
    }
}

/*
 * a => 2
 * b => 2
 * c => 1
 * C => 2
 * 
 * abCcCba
 * 
 * 
 */