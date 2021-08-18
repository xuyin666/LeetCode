package TwoPointers;

// 345. Reverse Vowels of a String
// Given a string s, reverse only all the vowels in the string and return it.
// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.

import java.util.ArrayList;
import java.util.List;

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        if(s== null) return null;
        int i = 0;
        int j = s.length()-1;
        char[] result = new char[s.length()];
        List<Character> arrList = new ArrayList<>();
        arrList.add('a');
        arrList.add('e');
        arrList.add('i');
        arrList.add('o');
        arrList.add('u');
        arrList.add('A');
        arrList.add('E');
        arrList.add('I');
        arrList.add('O');
        arrList.add('U');
        while (i <= j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if ( arrList.contains(ch1) && arrList.contains(ch2)) {
                result[i] = ch2;
                result[j] = ch1;
                i++;
                j--;
            } else if ( arrList.contains(ch1) && !arrList.contains(ch2)) {
                result[j] = ch2;
                j--;
            } else if (!arrList.contains(ch1) && arrList.contains(ch2)) {
                result[i] = ch1;
                i++;
            } else {
                result[i] = ch1;
                result[j] = ch2;
                i++;
                j--;
            }
        }
        return new String(result);
    }
}
