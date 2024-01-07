package Leetcode;

import java.util.Arrays;
import java.util.List;

public class _1431KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extra = 3;
        var result = kidsWithCandies(candies, extra);
        System.out.println("result = " + result);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        Boolean[] result = new Boolean[candies.length];

        for (int candy : candies) {
            if (max < candy) max = candy;
        }

        for (int i = 0; i < candies.length; i++) {
            result[i] = max <= candies[i] + extraCandies;
        }

        return Arrays.asList(result);
    }
}
