package StringExercice;

// 242. Valid Anagram
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap <Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            hashMap.put(t.charAt(i), hashMap.getOrDefault(t.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) - 1);
        }
        for (char c : hashMap.keySet()) {
            if (hashMap.get(c) != 0) return false;
        }
        return true;
    }
}
