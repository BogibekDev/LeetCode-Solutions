package Leetcode;

public class _605CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowers = {1, 0, 0, 0, 1, 0, 0};
        int n = 2;
        System.out.println("canPlaceFlowers(flowers,n) = " + canPlaceFlowers(flowers, n));
    }


    /*
     *
     *
     *
     */
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean isPreviewEmpty, isNextEmpty;
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                isPreviewEmpty = i == 0 || flowerbed[i - 1] == 0;
                isNextEmpty = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;
                if (isNextEmpty && isPreviewEmpty) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count >= n;
    }
}
