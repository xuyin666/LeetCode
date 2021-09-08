package StringExercice;

// 205. Isomorphic Strings
// Given two strings s and t, determine if they are isomorphic.
// Two strings s and t are isomorphic if the characters in s can be replaced to get t.
// All occurrences of a character must be replaced with another character while preserving the order of characters.
// No two characters may map to the same character, but a character may map to itself.


public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int[] arrS = new int[256];
        int[] arrT = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char chs = s.charAt(i);
            char cht = t.charAt(i);
            if (arrS[chs] != arrT[cht]) return false;
            // by default the value in the array is 0
            arrS[chs] = i + 1;
            arrT[cht] = i + 1;
        }
        return true;
    }
}
