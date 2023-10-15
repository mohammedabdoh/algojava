package com.mohammedabdoh.dsa.datastructures.strings;

public class IsSubsequent {
    public static boolean solution(String s, String t)  {
        if(s.length() == t.length() && s.equals(t)) {
            return true;
        } else if(s.length() == t.length() && !s.equals(t)) {
            return false;
        }

        if(s.isEmpty()) {
            return true;
        }

        int sPointer = 0;
        int tPointer = 0;
        
        while (sPointer < s.length()) {
            while(tPointer < t.length()) {
                if(s.charAt(sPointer) == t.charAt(tPointer)) {
                    if(sPointer == s.length() - 1) {
                        return true;
                    }
                    tPointer++;
                    break;
                }
                tPointer++;
            }
            sPointer++;
        }

        return false;
    }
}
