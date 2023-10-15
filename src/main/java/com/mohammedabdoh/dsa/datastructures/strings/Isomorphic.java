package com.mohammedabdoh.dsa.datastructures.strings;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    public static boolean solution(String str1, String str2) {
        Map<Character, Character> mapOfChars = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            if(!mapOfChars.containsKey(str1.charAt(i))) {
                if(mapOfChars.containsValue(str2.charAt(i))) {
                    return false;
                }
                mapOfChars.put(str1.charAt(i), str2.charAt(i));
                continue;
            }

            if(mapOfChars.get(str1.charAt(i)) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
