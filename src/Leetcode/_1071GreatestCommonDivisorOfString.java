package Leetcode;

public class _1071GreatestCommonDivisorOfString {
    public static void main(String[] args) {

    }

    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";
        int ekubOfLength = ekub(str1.length(), str2.length());

        return str1.substring(0, ekubOfLength);

    }

    private int ekub(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2) num1 -= num2;
            else num2 -= num1;
        }
        return num1;
    }
}
