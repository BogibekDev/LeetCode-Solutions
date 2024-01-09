package Leetcode;

public class _345ReverseVowelsOfaString {
    public static void main(String[] args) {
        String s = " ";
        String res = reverseVowels(s);
        System.out.println("res = " + res);

    }

    public static String reverseVowels(String s) {

        char[] ss = s.toCharArray();
        int[] list = new int[ss.length];
        int count = -1;

        for (int i = 0; i < ss.length; i++) {
            if (isVowel(ss[i])) {
                list[++count] = i;
            }
        }

        if (count == -1) return s;

        for (int i = 0; i <= count / 2; i++) {
            char temp = ss[list[i]];
            ss[list[i]] = ss[list[count - i]];
            ss[list[count - i]] = temp;
        }

        return new String(ss);

    }

    private static boolean isVowel(char ss) {
        return ss == 'u' || ss == 'a' || ss == 'e' || ss == 'i' || ss == 'o' ||
                ss == 'U' || ss == 'A' || ss == 'E' || ss == 'I' || ss == 'O';
    }
}
