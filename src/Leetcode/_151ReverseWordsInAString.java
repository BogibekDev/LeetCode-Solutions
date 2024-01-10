package Leetcode;

public class _151ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "the sky is      blue";
        String res = reverseWords(s);
        System.out.println("res = " + res);
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isBlank())
                res.append(words[i]).append(" ");
        }
        return res.toString().trim();

    }

}
