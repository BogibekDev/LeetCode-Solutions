package Leetcode;

public class _1768MergeString {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc","pqr"));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();

        if (word1.length() >= word2.length()) {
            for (int i = 0; i < word2.length(); i++) {
                result.append(word1.charAt(i)).append(word2.charAt(i));
            }

            result.append(word1.substring(word2.length()));
        } else {
            for (int i = 0; i < word1.length(); i++) {
                result.append(word1.charAt(i)).append(word2.charAt(i));
            }

            result.append(word2.substring(word1.length()));
        }

        return result.toString();

    }
}
