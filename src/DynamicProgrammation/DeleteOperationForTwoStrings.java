package DynamicProgrammation;

public class DeleteOperationForTwoStrings {
    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();

        if (len1 == 0 && len2 == 0) {
            return 0;
        } else if(len1 != 0 && len2 != 0) {
            if (word1.charAt(0) == word2.charAt(0))
                return minDistance(word1.substring(1, len1), word2.substring(1, len2));
            else
                return 1 + Math.min(
                        minDistance(word1.substring(1, len1), word2),
                        minDistance(word1, word2.substring(1, len2))
                );
        } else if(len1 == 0) {
            return len2;
        } else
            return len1;
    }
}
